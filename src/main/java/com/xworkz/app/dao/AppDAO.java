package com.xworkz.app.dao;

import com.xworkz.app.entity.AppEntity;

public interface AppDAO {
    public boolean save(AppEntity entity);

    AppEntity findByEmail(String email);
}
