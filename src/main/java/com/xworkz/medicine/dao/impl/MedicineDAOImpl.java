package com.xworkz.medicine.dao.impl;

import com.xworkz.medicine.dao.DBConstant;
import com.xworkz.medicine.dao.MedicineDAO;
import com.xworkz.medicine.dto.MedicineDTO;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class MedicineDAOImpl implements MedicineDAO {
    String sql = "insert into medicine(name,mg,expiry,composition)values(?,?,?,?)";

    @Override
    @SneakyThrows
    public boolean save(MedicineDTO medicineDTO) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(DBConstant.URL.getValue(), DBConstant.USER.getValue(), DBConstant.PASSWORD.getValue())) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, medicineDTO.getName());
            preparedStatement.setString(2, medicineDTO.getMg());
            preparedStatement.setString(3, medicineDTO.getExpiry());
            preparedStatement.setString(4, medicineDTO.getComposition());
            int row = preparedStatement.executeUpdate();
            System.out.println(row);
            return row > 0;
        }
    }
}
