package com.xworkz.app.controller;

import com.xworkz.app.dto.AppDTO;
import com.xworkz.app.dto.LoginDTO;
import com.xworkz.app.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class AppController {

    @Autowired
    private AppService service;

    @GetMapping("/signUp")
    public String getSignUp(Model model) {
        model.addAttribute("appDTO", new AppDTO());
        return "signUp";
    }
    @PostMapping("/welcome")
    public String getSignUpData(AppDTO appDTO) throws Exception {
        System.out.println("DTO RECEIVED = " + appDTO);
        boolean saved = service.validAndSave(appDTO);
        return saved ? "good" : "bad";
    }

    @GetMapping("/signIn")
    public String getSignIn() {
        return "signIn";
    }

    @PostMapping("/login")
    public String login(LoginDTO dto, Model model) {
        try {
            boolean success = service.login(dto.getEmail(), dto.getPassword());
            return success ? "home" : "signIn";
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "otp";
        }
    }
    @GetMapping("/otp")
    public String otpPage(String email,Model model){
        model.addAttribute("email",email);
        return "otp";
    }

    @PostMapping("/verifyOtp")
    public String verifyOtp(@RequestParam String email,@RequestParam String otp,Model model){
        boolean valid= service.verifyOtp(email,otp);
        if (!valid){
            model.addAttribute("email",email);
            model.addAttribute("error","Invalid or Expired OTP");
            return "otp";
        }
        model.addAttribute("email",email);
        return "resetPassword";
    }
}
