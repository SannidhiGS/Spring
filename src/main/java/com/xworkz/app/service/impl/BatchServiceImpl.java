package com.xworkz.app.service.impl;

import com.xworkz.app.dao.BatchDAO;
import com.xworkz.app.dto.BatchDTO;
import com.xworkz.app.entity.BatchEntity;
import com.xworkz.app.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BatchServiceImpl implements BatchService {

    @Autowired
    private BatchDAO dao;

//    @Override
//    public void save(BatchDTO dto) {
//        BatchEntity entity = new BatchEntity();
//        entity.setBatchName(dto.getBatchName());
//        dao.save(entity);     // ✅ entity only to DAO
//    }

    @Override
    public List<BatchEntity> getAllBatches() {
        return dao.getAllBatches();
    }

    @Override
    public BatchEntity getBatchById(int id) {
        return dao.getBatchById(id);
    }@Override
    public void save(BatchDTO dto) {
        BatchEntity entity = new BatchEntity();
        entity.setBatchName(dto.getBatchName());
        dao.save(entity);   // ✅ correct
    }
}
