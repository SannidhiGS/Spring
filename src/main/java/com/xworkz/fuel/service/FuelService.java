package com.xworkz.fuel.service;

import com.xworkz.fuel.dao.FuelDAO;
import com.xworkz.fuel.dto.FuelDTO;

public interface FuelService {
   boolean validAndSave(FuelDTO fuelDTO);
}
