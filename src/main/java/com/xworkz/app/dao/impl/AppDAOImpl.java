package com.xworkz.app.dao.impl;

import com.xworkz.app.dao.AppDAO;
import com.xworkz.app.entity.AppEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

@Repository
public class AppDAOImpl implements AppDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public boolean save(AppEntity entity) {
        entityManager.persist(entity);
        return true;
    }

    @Override
    public AppEntity findByEmail(String email) {
        try {
            return entityManager.createQuery(
                            "FROM AppEntity WHERE email = :email", AppEntity.class)
                    .setParameter("email", email)
                    .getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public AppEntity findByPhoneNumber(String phoneNumber) {
        try {
            return entityManager.createQuery(
                            "FROM AppEntity WHERE phoneNumber = :phoneNumber", AppEntity.class)
                    .setParameter("phoneNumber", phoneNumber)
                    .getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean update(AppEntity entity) {
        entityManager.merge(entity);
        entityManager.flush();
        return true;
    }

}
