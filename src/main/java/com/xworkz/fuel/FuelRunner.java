package com.xworkz.fuel;

import com.xworkz.fuel.config.CoreConfig;
import com.xworkz.fuel.dao.FuelDAO;
import com.xworkz.fuel.dto.FuelDTO;
import com.xworkz.fuel.service.FuelService;
import com.xworkz.fuel.service.impl.FuelServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FuelRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(CoreConfig.class);
        FuelDTO fuelDTO=new FuelDTO();
        fuelDTO.setName("Coron");
        fuelDTO.setFuelType("4TOil");
        fuelDTO.setLocation("Thirthahalli");
        fuelDTO.setBarcode("786gfh");
        System.out.println("Fuel Info"+fuelDTO);
        FuelServiceImpl service=applicationContext.getBean(FuelServiceImpl.class);
        service.validAndSave(fuelDTO);

    }
}
