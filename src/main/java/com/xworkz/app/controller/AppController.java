package com.xworkz.app.controller;

import com.xworkz.app.dto.AppDTO;
import com.xworkz.app.dto.LoginDTO;
import com.xworkz.app.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@Controller
public class AppController {
    public AppController(){
        System.out.println("The App Controller class is created");
    }
    @Autowired
    AppService service;
//    @RequestMapping("/index")
//    public String home(){
//        return "index.jsp";
//    }
    @GetMapping("/signUp")
    public String getSignUp(){
        return "signUp.jsp";
    }

    @GetMapping("signIn")
    public String getSignIn(){
        return "signIn.jsp";
    }

    @PostMapping("welcome")
    public String getSignUpData(@ModelAttribute AppDTO appDTO) throws Exception {
        boolean saved=service.validAndSave(appDTO);
        if(saved){
            return "good.jsp";
        }
        else{
            return "bad.jsp";
        }
    }
    @PostMapping("login")
    public String login(LoginDTO dto, Model model) throws NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException {
        boolean success=service.login(dto.getEmail(),dto.getPassword());
        if(success){
            return "good.jsp";
        }
        model.addAttribute("error", "Invalid email or password");
        return "signIn.jsp";

    }
}
