package com.xworkz.app.controller;

import com.xworkz.app.dto.AppDTO;
import com.xworkz.app.dto.LoginDTO;
import com.xworkz.app.service.AppService;
import com.xworkz.app.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
    public String getSignUpData(AppDTO appDTO) throws Exception {
        boolean saved = service.validAndSave(appDTO);
        return saved ? "good" : "bad";
    }

    // ================= SIGN IN =================
    @GetMapping("/signIn")
    public String getSignIn() {
        return "signIn";
    }

    @PostMapping("/login")
    public String login(LoginDTO dto,
                        HttpServletRequest request,
                        Model model) {
        try {
            boolean success = service.login(dto.getEmail(), dto.getPassword());

            if (success) {
                HttpSession session = request.getSession();
                session.setAttribute("loggedInEmail", dto.getEmail());

                // IMPORTANT CHANGE
                return "redirect:/home";
            }

            model.addAttribute("error", "Invalid credentials");
            return "signIn";

        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "otp";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/signIn";
    }

    // ================= SEND OTP =================
    @GetMapping("/sendOtp")
    public String sendOtp(@RequestParam String email, Model model) {
        service.generateAndSendOtp(email);
        model.addAttribute("email", email);
        return "otp";
    }

    // ================= VERIFY OTP =================
    @PostMapping("/verifyOtp")
    public String verifyOtp(@RequestParam String email,
                            @RequestParam String otp,
                            HttpSession session,
                            Model model) {

        boolean valid = service.verifyOtp(email, otp);

        if (!valid) {
            model.addAttribute("email", email);
            model.addAttribute("error", "Invalid or Expired OTP");
            return "otp";
        }

        session.setAttribute("resetEmail", email);
        return "resetPassword";
    }

    // ================= RESET PASSWORD =================
    @PostMapping("/reset-password")
    public String resetPassword(HttpSession session,
                                @RequestParam String newPassword,
                                @RequestParam String confirmPassword,
                                Model model) throws Exception {

        String email = (String) session.getAttribute("resetEmail");

        if (email == null) {
            model.addAttribute("error", "Session expired. Please try again.");
            return "signIn";
        }

        if (!newPassword.equals(confirmPassword)) {
            model.addAttribute("error", "Passwords do not match");
            return "resetPassword";
        }

        boolean updated = service.updatePassword(email, newPassword);

        if (!updated) {
            model.addAttribute("error", "Password update failed");
            return "resetPassword";
        }

        session.removeAttribute("resetEmail");
        return "signIn";
    }
}
