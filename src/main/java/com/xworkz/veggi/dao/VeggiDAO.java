package com.xworkz.veggi.dao;

import com.xworkz.veggi.entity.VeggiEntity;

public interface VeggiDAO {
    boolean save(VeggiEntity entity);
    boolean update(VeggiEntity entity);
    boolean delete(VeggiEntity entity);
   VeggiEntity  read(int id);
}
