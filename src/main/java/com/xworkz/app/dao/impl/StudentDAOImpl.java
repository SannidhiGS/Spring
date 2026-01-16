package com.xworkz.app.dao.impl;

import com.mysql.cj.xdevapi.SessionFactory;
import com.xworkz.app.dao.StudentDAO;
import com.xworkz.app.entity.StudentEntity;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(StudentEntity student) {
        entityManager.persist(student);
    }

    @Override
    public List<StudentEntity> findByBatchId(int batchId) {
        return entityManager.createQuery(
                        "FROM StudentEntity s WHERE s.batch.id = :batchId",
                        StudentEntity.class)
                .setParameter("batchId", batchId)
                .getResultList();
    }
}
