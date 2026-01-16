package com.xworkz.app.service;

import com.xworkz.app.dto.BatchDTO;
import com.xworkz.app.entity.BatchEntity;
import java.util.List;

public interface BatchService {
    void save(BatchDTO dto);
    List<BatchEntity> getAllBatches();
    BatchEntity getBatchById(int id);
}

