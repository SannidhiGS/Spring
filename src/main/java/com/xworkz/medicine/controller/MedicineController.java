package com.xworkz.medicine.controller;

import com.xworkz.medicine.dto.MedicineDTO;
import com.xworkz.medicine.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
            return "Response";
        }
        else{
            return "Error";
        }
    }
    @GetMapping("/medi")
    public String searchByMedicineName(@RequestParam("name") String name, Model model) throws Exception {
        System.out.println("name"+name);
        String data= String.valueOf(medicineService.getMedicineName(name));
        System.out.println();
        System.out.println("Searched Data :"+data);
        model.addAttribute("searchedData", data);
        return "Search";
    }
    @GetMapping("/getMedicine")
    public String getMedicine(@RequestParam("medicineId")int id,Model model) throws Exception {
        MedicineDTO medicineDTO=medicineService.getMedicineId(id);
        model.addAttribute("medicine",medicineDTO);
        return "getByID";
    }
    @GetMapping("/getMedicineInfo/{medicineId}")
    public String getMedicineInfo(@PathVariable("medicineId")int id,Model model) throws Exception {
        MedicineDTO medicineDTO=medicineService.getMedicineId(id);
        model.addAttribute("medicineDTO",medicineDTO);
        return "Update";
    }
    @PostMapping("/updateMedicine")
    public String updateMedicine(MedicineDTO dto,Model model) throws Exception {
        boolean medicine= medicineService.updateMedicine(dto);
        model.addAttribute("editDTO",dto);
        if(true){
            model.addAttribute("successMessage","Your data updated successfully");
        }
        else{
            model.addAttribute("errorMessage","Your data is not updated succesfully");
        }
        return "Update";
    }
}