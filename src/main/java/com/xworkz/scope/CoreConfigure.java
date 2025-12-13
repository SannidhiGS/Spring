package com.xworkz.scope;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.scope")
public class CoreConfigure {
    public CoreConfigure(){
        System.out.println("The core configure method is invoked");
    }
}
