package com.xworkz.suggi.service.impl;

import com.xworkz.suggi.dao.SuggiDAO;
import com.xworkz.suggi.dto.SuggiDTO;
import com.xworkz.suggi.service.SuggiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component
public class SuggiServiceImpl implements SuggiService {
    @Autowired
    SuggiDAO suggiDAO;
    @Override
    public boolean validAndSave(SuggiDTO suggiDTO) throws SQLException, ClassNotFoundException {
        boolean isInValid=false;
        if(suggiDTO.getName().length()<0){
            isInValid=true;
        }
        if(suggiDTO.getCode().length()<0){
            isInValid=true;
        }
        if(suggiDTO.getOwner().length()<0){
            isInValid=true;
        }
        if(suggiDTO.getLocation().length()<0){
            isInValid=true;
        }
        if(suggiDTO.getFssai().length()<0){
            isInValid=true;
        }
        if(suggiDTO.getEmail().length()<0){
            isInValid=true;
        }
        if(suggiDTO.getPhone().length()<0){
            isInValid=true;
        }
        if(suggiDTO.getCusine().length()<0){
            isInValid=true;
        }
        if(suggiDTO.getPincode().length()<0){
            isInValid=true;
        }
        if(suggiDTO.getSign().length()<0){
            isInValid=true;
        }
        boolean saved=suggiDAO.save(suggiDTO);
        return saved;
    }
}
