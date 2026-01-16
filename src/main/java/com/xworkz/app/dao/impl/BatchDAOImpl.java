package com.xworkz.app.dao.impl;

import com.xworkz.app.dao.BatchDAO;
import com.xworkz.app.entity.BatchEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BatchDAOImpl implements BatchDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<BatchEntity> getAllBatches() {
        Session session = sessionFactory.openSession();
        List<BatchEntity> list =
                session.createQuery("from BatchEntity", BatchEntity.class).list();
        session.close();
        return list;
    }

    @Override
    public BatchEntity getBatchById(int id) {
        Session session = sessionFactory.openSession();
        BatchEntity batch = session.get(BatchEntity.class, id);
        session.close();
        return batch;
    }

    @Override
    public void saveBatch(BatchEntity batch) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(batch);
        session.getTransaction().commit();
        session.close();
    }
}
