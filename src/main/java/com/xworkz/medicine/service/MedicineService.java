package com.xworkz.medicine.service;

import com.xworkz.medicine.dto.MedicineDTO;

import java.util.Optional;

public interface MedicineService {
    boolean validAndSave(MedicineDTO medicineDTO) throws Exception;
    MedicineDTO getMedicineName(String medicineName) throws Exception;
    MedicineDTO getMedicineId(int medicineId) throws Exception;
    boolean updateMedicine(MedicineDTO medicineDTO) throws Exception;
}
