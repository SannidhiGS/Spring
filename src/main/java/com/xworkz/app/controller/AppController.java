package com.xworkz.app.controller;

import com.xworkz.app.dto.AppDTO;
import com.xworkz.app.service.AppService;
import com.xworkz.app.service.impl.AppServiceImpl.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;

@Controller
@RequestMapping("/")
public class AppController {

    @Autowired
    private AppService service;

    @Autowired
    private MailService mailService;

    // ================= HOME =================
    @GetMapping("/home")
    public String home() {
        return "home";
    }

    // ================= SIGN UP =================
    @GetMapping("/signUp")
    public String getSignUp(Model model) {
        model.addAttribute("appDTO", new AppDTO());
        return "signUp";
    }

    @PostMapping("/welcome")
    public String registerUser(@ModelAttribute AppDTO appDTO,
                               @RequestParam("profilePhoto") MultipartFile profilePhoto,
                               Model model) throws Exception {

        if (!profilePhoto.isEmpty()) {
            String fileName = profilePhoto.getOriginalFilename();
            String uploadDir = "C:/uploads/"; // change path if needed
            File dest = new File(uploadDir + fileName);
            dest.getParentFile().mkdirs();
            profilePhoto.transferTo(dest);

            // save file name in DTO
            appDTO.setProfilePhoto(fileName);
        }

        boolean saved = service.validAndSave(appDTO); // saves to DB
        model.addAttribute("appDTO", appDTO); // send to JSP
        return saved ? "good" : "bad";
    }

}
