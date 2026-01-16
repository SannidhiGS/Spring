package com.xworkz.app.dao.impl;

import com.xworkz.app.dao.AppDAO;
import com.xworkz.app.entity.AppEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Repository
public class AppDAOImpl implements AppDAO {
    @Autowired
    EntityManagerFactory entityManagerFactory;
    @Override
    public boolean save(AppEntity entity) {
        EntityManager manager=entityManagerFactory.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(entity);
        manager.getTransaction().commit();;
        manager.close();
        return true;
    }

    @Override
    public AppEntity findByEmail(String email) {
        EntityManager manager = entityManagerFactory.createEntityManager();
        try {
            return manager.createQuery(
                            "FROM AppEntity WHERE email = :email", AppEntity.class)
                    .setParameter("email", email)
                    .getSingleResult();
        } catch (Exception e) {
            return null;
        } finally {
            manager.close();
        }
    }
}
