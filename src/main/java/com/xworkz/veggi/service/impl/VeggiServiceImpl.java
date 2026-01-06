package com.xworkz.veggi.service.impl;

import com.xworkz.veggi.dao.VeggiDAO;
import com.xworkz.veggi.dao.impl.VeggieDAOImpl;
import com.xworkz.veggi.dto.VeggiDTO;
import com.xworkz.veggi.entity.VeggiEntity;
import com.xworkz.veggi.service.VeggiService;
import org.springframework.beans.BeanUtils;

public class VeggiServiceImpl implements VeggiService {
    VeggiDAO veggiDAO=new VeggieDAOImpl();
    @Override
    public boolean validateAndSave(VeggiDTO veggiDTO) {
        VeggiEntity entity=new VeggiEntity();
        BeanUtils.copyProperties(veggiDTO,entity);
        veggiDAO.save(entity);
        return true;
    }

    @Override
    public boolean update(VeggiDTO veggiDTO) {
        VeggiEntity entity=new VeggiEntity();
        BeanUtils.copyProperties(veggiDTO,entity);
        veggiDAO.update(entity);
        return true;
    }
    @Override
    public boolean delete(VeggiDTO veggiDTO){
        VeggiEntity entity=new VeggiEntity();
        BeanUtils.copyProperties(veggiDTO,entity);
        veggiDAO.delete(entity);
        return true;
    }

    @Override
    public VeggiDTO findById(int id) {
        VeggiEntity entity=new VeggiEntity();
        if(entity!=null){
            VeggiDTO veggiDTO=new VeggiDTO();
            BeanUtils.copyProperties(entity,veggiDTO);
            return veggiDTO;
        }
        return null;
    }
}
