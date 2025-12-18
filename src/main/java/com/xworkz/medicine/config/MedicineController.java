package com.xworkz.medicine.config;

import com.xworkz.medicine.dto.MedicineDTO;
import com.xworkz.medicine.service.MedicineService;
import com.xworkz.medicine.service.impl.MedicineServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MedicineController {
    public MedicineController(){
        System.out.println("The MedicineController servlet is initiated");
    }
    @Autowired
    MedicineService medicineService;
    @PostMapping("/medicine")
    public String addMedicine(MedicineDTO medicineDTO) throws Exception {
        System.out.println("The medicine data is processing");
        System.out.println(medicineDTO);
        boolean saved= medicineService.validAndSave(medicineDTO);
        if(saved) {
            return "Response.jsp";
        }
        else{
            return "Error.jsp";
        }
    }
}
