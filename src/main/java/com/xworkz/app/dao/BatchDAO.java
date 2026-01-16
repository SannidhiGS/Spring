package com.xworkz.app.dao;

import com.xworkz.app.entity.BatchEntity;
import java.util.List;

public interface BatchDAO {
    void save(BatchEntity entity);
    List<BatchEntity> getAllBatches();
    BatchEntity getBatchById(int id);
}


