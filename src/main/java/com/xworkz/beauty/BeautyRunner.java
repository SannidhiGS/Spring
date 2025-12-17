package com.xworkz.beauty;

import com.xworkz.beauty.config.BeautyConfig;
import com.xworkz.beauty.dto.BeautyDTO;
import com.xworkz.beauty.service.BeautyService;
import com.xworkz.beauty.service.impl.BeautyServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeautyRunner {
    public static void main(String[] args) {
        ApplicationContext ap=new AnnotationConfigApplicationContext(BeautyConfig.class);
        BeautyDTO beautyDTO=new BeautyDTO();
        beautyDTO.setName("Lipstick");
        beautyDTO.setBrand("Nyka");
        beautyDTO.setPrice(120);
        System.out.println("Beauty details"+beautyDTO);
        BeautyService beautyService=ap.getBean(BeautyService.class);
        beautyService.validAndSave(beautyDTO);
    }
}
