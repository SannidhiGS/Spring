package com.xworkz.app.service;

import com.xworkz.app.dto.AppDTO;
import com.xworkz.app.dto.LoginDTO;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public interface AppService{
    boolean validAndSave(AppDTO appDTO) throws Exception;
    boolean login(String email, String password) throws NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException;
}
