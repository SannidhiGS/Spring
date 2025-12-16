package com.xworkz.kisan;

import com.xworkz.kisan.config.CoreConfig;
import com.xworkz.kisan.dto.KisanDTO;
import com.xworkz.kisan.service.KisanService;
import com.xworkz.kisan.service.impl.KisanServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class KisanRunner {
    public static void main(String[] args) {
        ApplicationContext ap=new AnnotationConfigApplicationContext(CoreConfig.class);
        KisanDTO kisanDTO=new KisanDTO();
        kisanDTO.setName("Siya");
        kisanDTO.setPhone("887677577");
        kisanDTO.setPlace("Ganapatikatte");
        kisanDTO.setUserType("Farmer");
        System.out.println("The farmer details"+kisanDTO);
        KisanServiceImpl service=ap.getBean(KisanServiceImpl.class);
        service.validAndSave(kisanDTO);
    }
}
