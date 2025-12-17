package com.xworkz.beauty.dao.impl;
import com.xworkz.beauty.dao.BeautyDAO;
import com.xworkz.beauty.dto.BeautyDTO;
import com.xworkz.file.dao.DBConstant;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class BeautyDAOImpl implements BeautyDAO {
    String sql="Insert into beauty(name,brand,price)values (?,?,?)";
    @Override
    public boolean save(BeautyDTO beautyDTO) {
        try(Connection connection=DriverManager.getConnection(DBConstant.URL.getValue(),DBConstant.USER.getValue(), DBConstant.PASSWORD.getValue())) {
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
           preparedStatement.setString(1, beautyDTO.getName());
           preparedStatement.setString(2, beautyDTO.getBrand());
           preparedStatement.setInt(3,beautyDTO.getPrice());
           int row=preparedStatement.executeUpdate();
            System.out.println("Rows:"+row);
            return row>0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
