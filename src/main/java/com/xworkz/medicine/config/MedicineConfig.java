package com.xworkz.medicine.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.medicine")
public class MedicineConfig {
    public MedicineConfig(){
        System.out.println("The MedicineConfig constructor is created");
    }
}
