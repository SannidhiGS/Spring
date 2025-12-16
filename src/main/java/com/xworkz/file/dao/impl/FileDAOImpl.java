package com.xworkz.file.dao.impl;

import com.xworkz.file.dao.DBConstant;
import com.xworkz.file.dao.FileDAO;
import com.xworkz.file.dto.FileDTO;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static com.xworkz.file.dao.DBConstant.URL;

@Component
@ToString
public class FileDAOImpl implements FileDAO {
    String SQL =
            "INSERT INTO file_tab(id,file_name,size) VALUES (?, ?, ?)";

    @Override
    public boolean save(FileDTO fileDTO) {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
            // Connect to DB
            try (Connection connection = DriverManager.getConnection(
                    DBConstant.URL.getValue(),
                    DBConstant.USER.getValue(),
                    DBConstant.PASSWORD.getValue())) {

                PreparedStatement ps = connection.prepareStatement(SQL);

                ps.setInt(1,fileDTO.getFileID());
                ps.setString(2, fileDTO.getFileName());
                ps.setString(3,fileDTO.getGetFileSize() );

                int row = ps.executeUpdate();
                System.out.println("Rows updated: " + row);
                return row > 0;
            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }

//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//            return false;
//        }
   }
}
