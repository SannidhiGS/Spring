package com.xworkz.medicine.dao;

import com.xworkz.medicine.dto.MedicineDTO;

import java.sql.SQLException;
import java.util.Optional;

public interface MedicineDAO {
    boolean save(MedicineDTO medicineDTO) throws SQLException, ClassNotFoundException;
    MedicineDTO findByName(String name) throws ClassNotFoundException, SQLException;
    MedicineDTO findById(int id ) throws ClassNotFoundException, SQLException;
    default boolean validAndUpdate(MedicineDTO medicineDTO) throws ClassNotFoundException, SQLException {
        return  false;
    }
}
