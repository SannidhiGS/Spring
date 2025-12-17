package com.xworkz.beauty.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.beauty")
public class BeautyConfig {
    public BeautyConfig(){
        System.out.println("The BeautyConfig method constructed");
    }
}
