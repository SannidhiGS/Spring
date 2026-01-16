package com.xworkz.app.dto;

import lombok.*;

import javax.validation.constraints.*;
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppDTO {

    private Integer id; // OK to keep

    @NotBlank
    @Size(min = 3, max = 30)
    private String name;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Pattern(regexp = "^[6-9]\\d{9}$")
    private String phoneNumber;

    @Min(18)
    @Max(60)
    private int age;

    @NotBlank
    private String gender;

//    @NotBlank
//    @Size(min = 5, max = 100)
//    private String username;
    private String address;

    @NotBlank
    @Size(min = 6)
    private String password;

    @NotBlank
    private String confirmPassword; // DTO only
}
