package com.xworkz.app.service.impl;

import com.xworkz.app.dao.AppDAO;
import com.xworkz.app.dto.AppDTO;
import com.xworkz.app.entity.AppEntity;
import com.xworkz.app.service.AppService;
import com.xworkz.app.service.MailService;
import com.xworkz.app.util.PasswordEncryptionUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDateTime;
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
    public boolean validAndSave(AppDTO appDTO) throws Exception {
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

        if (entity.isAccountLocked()) throw new Exception("Account Locked");

        if (PasswordEncryptionUtil.verify(password, entity.getPassword())) {
            entity.setFailedAttempts(0);
            appDAO.update(entity);
            return true;
        }

        entity.setFailedAttempts(entity.getFailedAttempts() + 1);
        if (entity.getFailedAttempts() >= 3) generateAndSendOtp(email);

        appDAO.update(entity);
        return false;
    }

    @Override
    public void generateAndSendOtp(String email) {
        AppEntity entity = appDAO.findByEmail(email);
        if (entity == null) throw new RuntimeException("User not found");

        String otp = generateOtp();
        entity.setOtp(otp);
        entity.setOtpExpiry(LocalDateTime.now().plusMinutes(5));
        entity.setAccountLocked(true);

        appDAO.update(entity);
        mailService.sendOtpMail(email, otp);
    }

    @Override
    public boolean verifyOtp(String email, String otp) {
        AppEntity entity = appDAO.findByEmail(email);
        if (entity == null || entity.getOtp() == null) return false;

        if (entity.getOtpExpiry().isBefore(LocalDateTime.now())) return false;

        return entity.getOtp().equals(otp);
    }

    @Override
    public boolean updatePassword(String email, String newPassword) throws Exception {
        AppEntity entity = appDAO.findByEmail(email);
        if (entity == null) return false;

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
}
