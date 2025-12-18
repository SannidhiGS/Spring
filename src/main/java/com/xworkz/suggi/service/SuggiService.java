package com.xworkz.suggi.service;

import com.xworkz.suggi.dto.SuggiDTO;

import java.sql.SQLException;

public interface SuggiService {
    boolean validAndSave(SuggiDTO suggiDTO) throws ClassNotFoundException, SQLException;
}
