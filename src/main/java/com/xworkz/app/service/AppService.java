package com.xworkz.app.service;

import com.xworkz.app.dto.AppDTO;

import javax.validation.Valid;

public interface AppService{
    // boolean validAndSave(AppDTO appDTO) throws Exception;
    boolean validAndSave(@Valid AppDTO dtoList) throws Exception;
    boolean login(String email, String password) throws Exception;
    public void generateAndSendOtp(String email);
    boolean verifyOtp(String email, String otp);

}
