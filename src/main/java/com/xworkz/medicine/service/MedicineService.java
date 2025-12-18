package com.xworkz.medicine.service;

import com.xworkz.medicine.dto.MedicineDTO;

public interface MedicineService {
    boolean validAndSave(MedicineDTO medicineDTO) throws Exception;
}
