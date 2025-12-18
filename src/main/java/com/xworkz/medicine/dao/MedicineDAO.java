package com.xworkz.medicine.dao;

import com.xworkz.medicine.dto.MedicineDTO;

import java.sql.SQLException;

public interface MedicineDAO {
    boolean save(MedicineDTO medicineDTO) throws SQLException, ClassNotFoundException;
}
