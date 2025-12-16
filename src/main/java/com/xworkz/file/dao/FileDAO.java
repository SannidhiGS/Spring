package com.xworkz.file.dao;

import com.xworkz.file.dto.FileDTO;

public interface FileDAO {
    boolean save(FileDTO fileDTO);
}
