package com.xworkz.app.controller;

import com.xworkz.app.entity.BatchEntity;
import com.xworkz.app.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BatchController {

    @Autowired
    private BatchService batchService;

    // Load batches for navbar dropdown
    @ModelAttribute("batches")
    public List<BatchEntity> loadBatches() {
        return batchService.getAllBatches();
    }

    @GetMapping("/addBatch")
    public String addBatchPage(Model model) {
        model.addAttribute("batch", new BatchEntity());
        return "addBatch";
    }

    @PostMapping("/saveBatch")
    public String saveBatch(@ModelAttribute("batch") BatchEntity batch) {
        batchService.saveBatch(batch);
        return "redirect:/home";
    }

    @GetMapping("/batch/{id}")
    public String openBatch(@PathVariable int id, Model model) {
        model.addAttribute("batch", batchService.getBatchById(id));
        return "batchDetails";
    }
}
