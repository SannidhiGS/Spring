package com.xworkz.app.dto;

import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppDTO {
    private  int id;
    private String name;
    private String email;
    private String phoneNumber;
    private int age;
    private String gender;
    private String address;
    private String password;
    private String confirmPassword;
}
