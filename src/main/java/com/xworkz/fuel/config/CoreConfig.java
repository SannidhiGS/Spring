package com.xworkz.fuel.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.fuel")
public class CoreConfig {
    public CoreConfig(){
        System.out.println("The core config constructor created");
    }
}
