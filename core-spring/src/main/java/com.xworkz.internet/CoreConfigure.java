package com.xworkz.internet;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.internet")
public class CoreConfigure {
    public CoreConfigure() {
        System.out.println("The core configuration invoked");
    }
}
