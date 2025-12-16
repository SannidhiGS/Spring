package com.xworkz.kisan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.kisan")
public class CoreConfig {
    public CoreConfig(){
        System.out.println("The core configuration created");
    }
}
