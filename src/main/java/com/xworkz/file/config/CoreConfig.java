package com.xworkz.file.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.file")
public class CoreConfig {
    public CoreConfig(){
        System.out.println("The corecofig created");
    }
}
