package com.xworkz.app.controller;

import com.xworkz.app.dto.AppDTO;
import com.xworkz.app.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;

@Controller
public class AppController {

    @Autowired
    private AppService service;

    @GetMapping({"/", "/home"})
    public String home() {
        return "home";
    }

    @GetMapping("/signUp")
    public String signUp(Model model) {
        model.addAttribute("appDTO", new AppDTO());
        return "signUp";
    }

    @GetMapping("/signIn")
    public String signIn() {
        return "signIn";
    }

    @PostMapping("/welcome")
    public String register(@ModelAttribute AppDTO appDTO,
                           @RequestParam(value = "profilePhoto", required = false)
                           MultipartFile profilePhoto,
                           Model model) throws Exception {

        if (profilePhoto != null && !profilePhoto.isEmpty()) {
            String fileName = profilePhoto.getOriginalFilename();
            File dest = new File("C:/uploads/" + fileName);
            dest.getParentFile().mkdirs();
            profilePhoto.transferTo(dest);
            appDTO.setProfilePhoto(fileName);
        }

        boolean saved = service.validAndSave(appDTO);

        if (saved) {
            model.addAttribute("appDTO", appDTO);
            return "good";
        }

        return "signUp";
    }


    @PostMapping("/login")
    public String login(@RequestParam String email,
                        @RequestParam String password,
                        HttpSession session,
                        Model model) throws Exception {

        boolean valid = service.login(email, password);

        if (valid) {
            session.setAttribute("loggedInEmail", email);
            return "redirect:/home";
        } else {
            model.addAttribute("error", "Invalid email or password");
            return "signIn";
        }
    }
}
