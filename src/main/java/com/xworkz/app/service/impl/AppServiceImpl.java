package com.xworkz.app.service.impl;

import com.xworkz.app.dao.AppDAO;
import com.xworkz.app.dto.AppDTO;
import com.xworkz.app.dto.LoginDTO;
import com.xworkz.app.entity.AppEntity;
import com.xworkz.app.service.AppService;
import com.xworkz.app.util.PasswordEncryptionUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.swing.text.html.parser.Entity;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

@Service
public class AppServiceImpl implements AppService {
@Autowired
    AppDAO appDAO;
    @Override
    public boolean validAndSave(AppDTO appDTO) throws Exception {
        boolean isInvalid=false;
        if(appDTO.getName() == null || appDTO.getName().length() > 15){
            throw new Exception("Invalid name");
        }
        if(appDTO.getPhoneNumber() == null || appDTO.getPhoneNumber().length() != 10){
            throw new Exception("Invalid phone number");
        }
        if(appDTO.getAge() < 0){
            throw new Exception("Invalid age");
        }
        if(appDTO.getGender() == null || appDTO.getGender().isEmpty()){
            throw new Exception("Invalid gender");
        }
        if(appDTO.getPassword() == null || appDTO.getPassword().length() < 6){
            throw new Exception("Password must be at least 6 characters");
        }
        String enCryptedPassword= PasswordEncryptionUtil.encrypt(appDTO.getPassword());
        if(isInvalid){
           throw  new Exception("your data is not valid");
        }
        AppEntity entity=new AppEntity();
        BeanUtils.copyProperties(appDTO,entity);
        entity.setPassword(enCryptedPassword);
        return appDAO.save(entity);
    }


    @Override
    public boolean login(String email, String password) throws NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException {
        AppEntity entity=appDAO.findByEmail(email);
        if(entity==null){
            return false;
        }
        String decrypted= Arrays.toString(PasswordEncryptionUtil.decrypt(entity.getPassword()));
        return entity.getPassword().equals(decrypted);
    }
}
