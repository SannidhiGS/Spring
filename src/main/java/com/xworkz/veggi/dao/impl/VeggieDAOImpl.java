package com.xworkz.veggi.dao.impl;

import com.xworkz.veggi.dao.VeggiDAO;
import com.xworkz.veggi.entity.VeggiEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class VeggieDAOImpl implements VeggiDAO {
    @Override
    public boolean save(VeggiEntity entity) {
        Configuration configuration=new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(VeggiEntity.class);
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction= session.beginTransaction();
        session.save(entity);
        transaction.commit();
        return true;
    }

    @Override
    public boolean update(VeggiEntity entity) {
        Configuration configuration=new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(VeggiEntity.class);
        SessionFactory sessionFactory= configuration.buildSessionFactory();
        Session session= sessionFactory.openSession();
        Transaction transaction= session.beginTransaction();
        session.update(entity);
        transaction.commit();
        return true;
    }

    @Override
    public boolean delete(VeggiEntity entity) {
        Configuration configuration=new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(VeggiEntity.class);
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction= session.beginTransaction();
        session.delete(entity);
        transaction.commit();
        return true;
    }

    @Override
    public VeggiEntity read(int id) {
        Configuration configuration=new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(VeggiEntity.class);
        SessionFactory sessionFactory= configuration.buildSessionFactory();
        Session session= sessionFactory.openSession();
        VeggiEntity entity=session.get(VeggiEntity.class,id);
        return entity;
    }
}
