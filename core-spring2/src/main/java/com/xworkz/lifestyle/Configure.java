package com.xworkz.lifestyle;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.lifestyle")
public class Configure {
    public Configure(){
        System.out.println("The configure class created");
    }
}
