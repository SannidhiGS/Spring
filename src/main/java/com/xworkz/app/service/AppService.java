package com.xworkz.app.service;

import com.xworkz.app.dto.AppDTO;
import com.xworkz.app.entity.AppEntity;

public interface AppService {

    boolean validAndSave(AppDTO appDTO) throws Exception;
    boolean login(String email, String password) throws Exception;
    void generateAndSendOtp(String email);
    boolean verifyOtp(String email, String otp);
    AppEntity getUserByEmail(String email);
    boolean updatePassword(String email, String newPassword) throws Exception;
}

