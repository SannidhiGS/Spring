package com.xworkz.app.dao.impl;

import com.xworkz.app.dao.BatchDAO;
import com.xworkz.app.entity.BatchEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class BatchDAOImpl implements BatchDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(BatchEntity entity) {
        entityManager.persist(entity);
    }

    @Override
    public List<BatchEntity> getAllBatches() {
        return entityManager
                .createQuery("FROM BatchEntity", BatchEntity.class)
                .getResultList();
    }

    @Override
    public BatchEntity getBatchById(int id) {
        return entityManager.find(BatchEntity.class, id);
    }
}
