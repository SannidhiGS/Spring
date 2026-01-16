package com.xworkz.app.controller;

import com.xworkz.app.entity.BatchEntity;
import com.xworkz.app.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class BatchController {

    @Autowired
    private BatchService batchService;

    @ModelAttribute("batches")
    public List<BatchEntity> loadBatches() {
        return batchService.getAllBatches();
    }

    @GetMapping("/batch/{id}")
    public String openBatch(@PathVariable int id, Model model) {
        BatchEntity batch = batchService.getBatchById(id);
        model.addAttribute("batch", batch);
        return "batchDetails";
    }
}
