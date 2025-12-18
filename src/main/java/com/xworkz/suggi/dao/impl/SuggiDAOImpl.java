package com.xworkz.suggi.dao.impl;

import com.xworkz.suggi.dao.DBConstant;
import com.xworkz.suggi.dao.SuggiDAO;
import com.xworkz.suggi.dto.SuggiDTO;
import com.xworkz.suggi.service.SuggiService;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
@Component
public class SuggiDAOImpl implements SuggiDAO {
    String sql = "INSERT INTO restaurant(name, owner, phone, email, location, pincode, fssai, code, sign, cuisine) "
            + "VALUES (?,?,?,?,?,?,?,?,?,?)";

    @Override
    public boolean save(SuggiDTO suggiDTO) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(DBConstant.URL.getValue(), DBConstant.USER.getValue(), DBConstant.PASSWORD.getValue())) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, suggiDTO.getName());
            preparedStatement.setString(2, suggiDTO.getOwner());
            preparedStatement.setString(3, suggiDTO.getPhone());
            preparedStatement.setString(4, suggiDTO.getEmail());
            preparedStatement.setString(5, suggiDTO.getLocation());
            preparedStatement.setString(6, suggiDTO.getPincode());
            preparedStatement.setString(7, suggiDTO.getFssai());
            preparedStatement.setString(8, suggiDTO.getCode());
            preparedStatement.setString(9, suggiDTO.getSign());
            preparedStatement.setString(10, suggiDTO.getCusine());
            int row = preparedStatement.executeUpdate();
            System.out.println(row);
            return row > 0;
        }
    }
}
