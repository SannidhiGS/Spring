package com.xworkz.file.service.impl;

import com.xworkz.file.dao.FileDAO;
import com.xworkz.file.dto.FileDTO;
import com.xworkz.file.service.FileService;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ToString
public class FileServiceImpl implements FileService {
    @Autowired
    FileDAO fileDAO;
    @Override
    public boolean validAndSave(FileDTO fileDTO) {
        boolean saved= fileDAO.save(fileDTO);
        return saved;
    }
}
