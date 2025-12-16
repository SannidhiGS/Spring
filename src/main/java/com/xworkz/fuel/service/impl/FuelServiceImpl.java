package com.xworkz.fuel.service.impl;

import com.xworkz.fuel.dao.FuelDAO;
import com.xworkz.fuel.dto.FuelDTO;
import com.xworkz.fuel.service.FuelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FuelServiceImpl implements FuelService {
    @Autowired
    FuelDAO fuelDAO;
    @Override
    public boolean validAndSave(FuelDTO fuelDTO) {
        boolean saved= fuelDAO.save(fuelDTO);
        return saved;
    }
}
