package com.xworkz.app.entity;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String email;
    private String phoneNumber;
    private int age;
    private String gender;
    private String address;
    private String password;

    @Column(name = "profile_photo")
    private String profilePhoto;

    private int failedAttempts;
    private boolean accountLocked;
    private String otp;
    private LocalDateTime otpExpiry;
}
