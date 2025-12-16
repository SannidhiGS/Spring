package com.xworkz.kisan.service.impl;

import com.xworkz.kisan.dao.KisanDAO;
import com.xworkz.kisan.dto.KisanDTO;
import com.xworkz.kisan.service.KisanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KisanServiceImpl implements KisanService {
    @Autowired
    KisanDAO kisanDAO;
    @Override
    public boolean validAndSave(KisanDTO kisanDTO) {
        boolean saved= kisanDAO.save(kisanDTO);
        return saved;
    }
}
