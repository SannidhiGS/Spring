package com.xworkz.app.service.impl;

import com.xworkz.app.dao.AppDAO;
import com.xworkz.app.dao.BatchDAO;
import com.xworkz.app.dto.AppDTO;
import com.xworkz.app.entity.AppEntity;
import com.xworkz.app.entity.BatchEntity;
import com.xworkz.app.service.AppService;
import com.xworkz.app.util.PasswordEncryptionUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

@Service
@Transactional
public class AppServiceImpl implements AppService {

    @Autowired
    private AppDAO appDAO;

    @Autowired
    private MailService mailService;

    private String generateOtp() {
        return String.valueOf(100000 + new Random().nextInt(900000));
    }

    @Override
    public boolean validAndSave(@Valid AppDTO appDTO) throws Exception {
        AppEntity entity = new AppEntity();
        BeanUtils.copyProperties(appDTO, entity, "id", "confirmPassword");
        entity.setPassword(PasswordEncryptionUtil.encrypt(appDTO.getPassword()));
        entity.setFailedAttempts(0);
        entity.setAccountLocked(false);
        return appDAO.save(entity);
    }

    @Override
    public boolean login(String email, String password) throws Exception {

        AppEntity entity = appDAO.findByEmail(email);
        if (entity == null) return false;

        if (entity.isAccountLocked()) {
            throw new Exception("Account locked");
        }

        if (PasswordEncryptionUtil.verify(password, entity.getPassword())) {
            entity.setFailedAttempts(0);
            appDAO.update(entity);
            return true;
        }

        int attempts = entity.getFailedAttempts() + 1;
        entity.setFailedAttempts(attempts);

        if (attempts >= 3) {
            generateAndSendOtp(email);
        }

        appDAO.update(entity);
        return false;
    }

    @Override
    public void generateAndSendOtp(String email) {

        AppEntity entity = appDAO.findByEmail(email);
        if (entity == null) {
            throw new RuntimeException("User not found");
        }

        String otp = generateOtp();

        entity.setOtp(otp);
        entity.setOtpExpiry(LocalDateTime.now().plusMinutes(5));
        entity.setAccountLocked(true);

        appDAO.update(entity);

        mailService.sendOtpMail(entity.getEmail(), otp);
    }

    @Override
    public boolean verifyOtp(String email, String otp) {

        AppEntity entity = appDAO.findByEmail(email);
        if (entity == null || entity.getOtp() == null) {
            return false;
        }

        if (entity.getOtpExpiry().isBefore(LocalDateTime.now())) {
            return false;
        }

        return entity.getOtp().equals(otp);
    }

    @Override
    public boolean updatePassword(String email, String newPassword) throws Exception {

        AppEntity entity = appDAO.findByEmail(email);
        if (entity == null) {
            return false;
        }

        entity.setPassword(PasswordEncryptionUtil.encrypt(newPassword));
        entity.setOtp(null);
        entity.setOtpExpiry(null);
        entity.setFailedAttempts(0);
        entity.setAccountLocked(false);

        appDAO.update(entity);
        return true;
    }
    @Override
    public AppEntity getUserByEmail(String email) {
        return appDAO.findByEmail(email);
    }

    @Service
    public static class BatchService {

        @Autowired
        private BatchDAO dao;

        public List<BatchEntity> getAllBatches() {
            return dao.getAllBatches();
        }

        public BatchEntity getBatchById(int id) {
            return dao.getBatchById(id);
        }

//        public void saveBatch(BatchEntity batch) {
//            dao.saveBatch(batch);
//        }
    }

    @Service
    public static class MailService {
        @Autowired
        private JavaMailSender mailSender;
        public void sendOtpMail(String toEmail, String otp) {

            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(toEmail);
            message.setSubject("OTP for Password Reset");
            System.out.println("Generated OTP = " + otp);
            message.setText(
                    "Dear User,\n\n" +
                            "Your OTP for password reset is: " + otp + "\n\n" +
                            "This OTP is valid for 5 minutes.\n\n" +
                            "Regards,\nXworkz App Team"
            );
            mailSender.send(message);
        }
    }
}
