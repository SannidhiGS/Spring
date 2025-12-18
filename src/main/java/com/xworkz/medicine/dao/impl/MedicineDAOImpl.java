package com.xworkz.medicine.dao.impl;

import com.xworkz.medicine.dao.DBConstant;
import com.xworkz.medicine.dao.MedicineDAO;
import com.xworkz.medicine.dto.MedicineDTO;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.Optional;

import static com.xworkz.medicine.dao.DBConstant.*;

@Component
public class MedicineDAOImpl implements MedicineDAO {
    String sql = "insert into medicine(name,mg,expiry,composition)values(?,?,?,?)";

    @Override
    @SneakyThrows
    public boolean save(MedicineDTO medicineDTO) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(URL.getValue(), USER.getValue(), PASSWORD.getValue())) {
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

    @Override
    public MedicineDTO findByName(String name) throws ClassNotFoundException, SQLException {
        String search = "Select * from medicine where name=?";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(URL.getValue(), USER.getValue(), PASSWORD.getValue());
             PreparedStatement preparedStatement = connection.prepareStatement(search)) {
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("Result row found...");
                int id = resultSet.getInt(1);
                String names = resultSet.getString(2);
                String mg = resultSet.getString(3);
                String expiry = resultSet.getString(4);
                String composition = resultSet.getString(5);
                MedicineDTO dto = new MedicineDTO(id,name,mg,expiry,composition);

                System.out.println("fishDTO from DB :" + dto);
                return dto;
            }
            return null;
        }
    }

    @Override
    public MedicineDTO findById(int id) throws ClassNotFoundException, SQLException {
         Class.forName("com.mysql.cj.jdbc.Driver");
         String idGet="select * from medicine where id=?";
         try(Connection connection=DriverManager.getConnection(URL.getValue(), USER.getValue(), PASSWORD.getValue());
             PreparedStatement ps=connection.prepareStatement(idGet);

         ){
             ps.setString(1, String.valueOf(id));
             ResultSet resultSet = ps.executeQuery();
             while (resultSet.next()) {
                 System.out.println("Result row found...");
                 int ids = resultSet.getInt(1);
                 String names = resultSet.getString(2);
                 String mg = resultSet.getString(3);
                 String expiry = resultSet.getString(4);
                 String composition = resultSet.getString(5);
                 MedicineDTO dto = new MedicineDTO(ids,names,mg,expiry,composition);

                 System.out.println("medicineDTO from DB :" + dto);
                 return dto;
             }
             return null;
         }
    }
    @Override
    public boolean validAndUpdate(MedicineDTO medicineDTO) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Updating the medicine DTO using the the id");
        String update = "UPDATE medicine SET name=?, mg=?, expiry=?, composition=? WHERE id=?";
        System.out.println("updateSQL :"+medicineDTO);
        try(Connection connection=DriverManager.getConnection(URL.getValue(),USER.getValue(), PASSWORD.getValue());
            PreparedStatement preparedStatement=connection.prepareStatement(update))
        {
            System.out.println("starting to update medicineDTO");
            preparedStatement.setString(1, medicineDTO.getName());
            preparedStatement.setString(2, medicineDTO.getMg());
            preparedStatement.setString(3,medicineDTO.getExpiry());
            preparedStatement.setString(4, medicineDTO.getComposition());
            preparedStatement.setInt(5, medicineDTO.getId());

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Updated data :"+rowsAffected);
            return rowsAffected > 0;
        }
    }
}
