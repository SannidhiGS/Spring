package com.xworkz.fuel.dao.impl;

import com.xworkz.fuel.dao.DBConstant;
import com.xworkz.fuel.dao.FuelDAO;
import com.xworkz.fuel.dto.FuelDTO;
import org.springframework.stereotype.Component;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
@Component
public class FuelDAOImpl implements FuelDAO {
    final String sql="Insert into fuel_station(name,location,barcode,fuel_type) values (?,?,?,?)";
    @Override
    public boolean save(FuelDTO fuelDTO) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection connection = DriverManager.getConnection(DBConstant.URL.getValue(),
                    DBConstant.USER.getValue(), DBConstant.PASSWORD.getValue())) {
                PreparedStatement ps = connection.prepareStatement(sql);
                ps.setString(1, fuelDTO.getName());
                ps.setString(2, fuelDTO.getLocation());
                ps.setString(3, fuelDTO.getBarcode());
                ps.setString(4, fuelDTO.getFuelType());

                int row = ps.executeUpdate();
                System.out.println("The number of row updated " + row);
                return row > 0;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
