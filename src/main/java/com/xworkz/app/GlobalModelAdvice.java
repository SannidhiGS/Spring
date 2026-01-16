package com.xworkz.app;

import com.xworkz.app.entity.BatchEntity;
import com.xworkz.app.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@ControllerAdvice
public class GlobalModelAdvice {

    @Autowired
    private BatchService batchService;

    @ModelAttribute("batches")
    public List<BatchEntity> loadBatches() {
        return batchService.getAllBatches();
    }
}
