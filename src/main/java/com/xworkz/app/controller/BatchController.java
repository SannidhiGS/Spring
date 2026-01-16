package com.xworkz.app.controller;

import com.xworkz.app.dto.BatchDTO;
import com.xworkz.app.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/batch")
public class BatchController {

    @Autowired
    private BatchService batchService;

    @GetMapping("/add")
    public String showBatchForm(Model model) {
        model.addAttribute("batchDTO", new BatchDTO());
        return "addBatch";
    }

    @PostMapping("/save")
    public String saveBatch(@ModelAttribute BatchDTO dto) {
        batchService.save(dto);
        return "redirect:/home";
    }
}
