package com.xworkz.app.controller;

import com.xworkz.app.entity.AppEntity;
import com.xworkz.app.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class ProfileController {

    @Autowired
    private AppService appService;

    @GetMapping("/profile")
    public String showProfile(HttpSession session, Model model) {
        String email = (String) session.getAttribute("loggedInEmail");
        if (email == null) {
            return "redirect:/signIn";
        }
        AppEntity entity = appService.getUserByEmail(email);
        model.addAttribute("user", entity);
        return "profile";
    }
}
