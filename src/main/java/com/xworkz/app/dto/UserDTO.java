package com.xworkz.app.dto;

import org.springframework.web.multipart.MultipartFile;
import lombok.*;

public class UserDTO {
    private String name;
    private String email;
    private String phoneNumber;
    private String password;
    private MultipartFile profilePhoto;
    // getters & setters
}
