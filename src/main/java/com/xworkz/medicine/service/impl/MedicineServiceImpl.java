package com.xworkz.medicine.service.impl;

import com.xworkz.medicine.dao.MedicineDAO;
import com.xworkz.medicine.dto.MedicineDTO;
import com.xworkz.medicine.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MedicineServiceImpl implements MedicineService {
    @Autowired
    MedicineDAO medicineDAO;
    @Override
    public boolean validAndSave(MedicineDTO medicineDTO) throws Exception {
        boolean isInValid=false;
        if(medicineDTO.getName().length()<0){
            isInValid=true;
        }
        if(medicineDTO.getMg().length()<0){
            isInValid=true;
        }
        if(medicineDTO.getComposition().length()<0){
            isInValid=true;
        }
        if (medicineDTO.getExpiry().length()<0){
            isInValid=true;
        }
        if(isInValid){
            throw new Exception("The data is not valid");
        }
        boolean saved=medicineDAO.save(medicineDTO);
        return saved;
    }
}
