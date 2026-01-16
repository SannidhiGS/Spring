package com.xworkz.app.util;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class PasswordEncryptionUtil {
    private static  final String ALGORITHM="AES";
    private static final String SECRET_KEY="MYSecretKey12345";

    public static String encrypt(String password) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        SecretKeySpec keySpec=new SecretKeySpec(SECRET_KEY.getBytes(),ALGORITHM);
        Cipher cipher=Cipher.getInstance(ALGORITHM);
        cipher.init(cipher.ENCRYPT_MODE,keySpec);
        byte[] bytes=cipher.doFinal(password.getBytes());
        return Base64.getEncoder().encodeToString(bytes);
    }

    public static byte[] decrypt(String encryptedPassword) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        SecretKeySpec keySpec=new SecretKeySpec(SECRET_KEY.getBytes(),ALGORITHM);
        Cipher cipher=Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE,keySpec);
        byte[] decodedBytes = Base64.getDecoder().decode(encryptedPassword);
        return new String(cipher.doFinal(decodedBytes)).getBytes();
    }
}
