package com.xworkz.suggi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.suggi")
public class SuggiConfig {
    public SuggiConfig(){
        System.out.println("The Suggi Cofig is created");
    }
}
