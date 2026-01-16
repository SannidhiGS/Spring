package com.xworkz.app.dao;

import com.xworkz.app.entity.StudentEntity;
import java.util.List;

public interface StudentDAO {
    void save(StudentEntity student);
    List<StudentEntity> findByBatchId(int batchId);
}
