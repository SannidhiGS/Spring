package com.xworkz.app.service;

import com.xworkz.app.entity.StudentEntity;

import java.util.List;

public interface StudentService {
    void save(StudentEntity student, int batchId);
    List<StudentEntity> getStudentsByBatch(int batchId);

    //void saveStudentWithBatch(StudentEntity student, int batchId);
}
