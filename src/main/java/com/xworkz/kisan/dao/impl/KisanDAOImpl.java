package com.xworkz.kisan.dao.impl;

import com.xworkz.kisan.dao.DBConstant;
import com.xworkz.kisan.dao.KisanDAO;
import com.xworkz.kisan.dto.KisanDTO;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
@Component
public class KisanDAOImpl implements KisanDAO {
    final String sql="Insert into kisan(name,phone,place,user_type) values (?,?,?,?)";
    @Override
    public boolean save(KisanDTO kisanDTO) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection connection = DriverManager.getConnection(DBConstant.URL.getValue(),
                    DBConstant.USER.getValue(), DBConstant.PASSWORD.getValue())) {
                PreparedStatement ps = connection.prepareStatement(sql);
                ps.setString(1, kisanDTO.getName());
                ps.setString(2, kisanDTO.getPhone());
                ps.setString(3, kisanDTO.getPlace());
                ps.setString(4, kisanDTO.getUserType());

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
