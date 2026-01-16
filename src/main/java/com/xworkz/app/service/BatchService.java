package com.xworkz.app.service;

import com.xworkz.app.dao.BatchDAO;
import com.xworkz.app.entity.BatchEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class BatchService {

    @Autowired
    private BatchDAO dao;

    public List<BatchEntity> getAllBatches() {
        return dao.getAllBatches();
    }

    public BatchEntity getBatchById(int id) {
        return dao.getBatchById(id);
    }
}
