package com.xworkz.suggi.dao;

import com.xworkz.suggi.dto.SuggiDTO;

import java.sql.SQLException;

public interface SuggiDAO {
    boolean save(SuggiDTO suggiDTO) throws SQLException, ClassNotFoundException;
}
