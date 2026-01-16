package com.xworkz.app.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppDTO {
    private String name;
    private String email;
    private String phoneNumber;
    private int age;
    private String gender;
    private String address;
    private String password;
    private String confirmPassword;
    private String profilePhoto; // uploaded filename
}
