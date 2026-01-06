package com.xworkz.veggi.service;

import com.xworkz.veggi.dto.VeggiDTO;
import com.xworkz.veggi.entity.VeggiEntity;

public interface VeggiService {
    boolean validateAndSave(VeggiDTO veggiDTO);
    boolean update(VeggiDTO veggiDTO);
    boolean delete(VeggiDTO veggiDTO);
    VeggiDTO findById(int id);

}
