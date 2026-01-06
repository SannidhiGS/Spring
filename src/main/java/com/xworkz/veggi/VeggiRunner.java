package com.xworkz.veggi;


import com.xworkz.veggi.dto.VeggiDTO;
import com.xworkz.veggi.service.VeggiService;
import com.xworkz.veggi.service.impl.VeggiServiceImpl;

public class VeggiRunner {
    public static void main(String[] args) {
        VeggiService veggiService = new VeggiServiceImpl();
        VeggiDTO veggiDTO = new VeggiDTO();
        veggiDTO.setId(3);
        veggiDTO.setName("Potato");
        veggiDTO.setColor("purple");
        veggiDTO.setPrice(50);
        veggiDTO.setSeason("Summer");
        System.out.println("The Veggie DTO Information are " + veggiDTO);
        boolean saved = veggiService.validateAndSave(veggiDTO);
        if (saved) {
            System.out.println("The veggie data saved successfully");
        } else {
            System.out.println("The veggie data saved not saved");
        }

        boolean saved1 = veggiService.validateAndSave(veggiDTO);
        if (saved1) {
            System.out.println("The updated");
        } else {
            System.out.println("The data not updated");
        }

//        boolean saved2=veggiService.delete(veggiDTO);
//        if (saved2){
//            System.out.println("The data deleted");
//        }
//        else{
//            System.out.println("The data not deleted");
//        }
        VeggiDTO saved3=veggiService.findById(veggiDTO.getId());
        if(saved3!=null){
            System.out.println("The data found"+veggiDTO);
        }
        else{
            System.out.println("The data not found");
        }
    }
}
