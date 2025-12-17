package com.xworkz.beauty.service.impl;

import com.xworkz.beauty.dao.BeautyDAO;
import com.xworkz.beauty.dao.impl.BeautyDAOImpl;
import com.xworkz.beauty.dto.BeautyDTO;
import com.xworkz.beauty.service.BeautyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeautyServiceImpl implements BeautyService {
    @Autowired
    BeautyDAO beautyDAO;
    @Override
    public boolean validAndSave(BeautyDTO beautyDTO) {
        beautyDAO.save(beautyDTO);
        return false;
    }
}