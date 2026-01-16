package com.xworkz.app.service.impl;

import com.xworkz.app.dao.BatchDAO;
import com.xworkz.app.dao.StudentDAO;
import com.xworkz.app.entity.BatchEntity;
import com.xworkz.app.entity.StudentEntity;
import com.xworkz.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO studentDAO;

    @Autowired
    private BatchDAO batchDAO;

    @Override
    public void save(StudentEntity student, int batchId) {

        BatchEntity batch = batchDAO.getBatchById(batchId);

        if (batch == null) {
            throw new RuntimeException("Batch not found with id: " + batchId);
        }

        student.setBatch(batch);
        studentDAO.save(student);
    }

    @Override
    public List<StudentEntity> getStudentsByBatch(int batchId) {
        return studentDAO.findByBatchId(batchId);
    }
}
