package com.xworkz.app.dao.impl;

import com.xworkz.app.dao.BatchDAO;
import com.xworkz.app.entity.BatchEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;
import java.util.Collections;
import java.util.List;
@Repository
public class BatchDAOImpl implements BatchDAO {
    @Autowired
    private EntityManagerFactory emf;

    @Override
    public List<BatchEntity> getAllBatches() {
        return emf.createEntityManager().createQuery("from BatchEntity", BatchEntity.class).getResultList();
    }
    @Override
    public BatchEntity getBatchById(int id) {
        return emf.createEntityManager().find(BatchEntity.class, id);
    }
}
