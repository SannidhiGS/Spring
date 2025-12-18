package com.xworkz.suggi.config;

import com.xworkz.suggi.dto.SuggiDTO;
import com.xworkz.suggi.service.SuggiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;

@Controller
@RequestMapping("/")
public class SuggiController {
    public SuggiController(){
        System.out.println("The SuggiController is created");
    }
    @Autowired
    SuggiService service;
    @PostMapping("/register")
    public String addRestaurants(SuggiDTO suggiDTO) throws SQLException, ClassNotFoundException {
        System.out.println("Getting the Suggi Details");
        boolean saved=service.validAndSave(suggiDTO);
        if(saved) {
            return "Response.jsp";
        }
        else{
            return "Error.jsp";
        }
    }
}
