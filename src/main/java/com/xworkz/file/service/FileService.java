package com.xworkz.file.service;

import com.xworkz.file.dto.FileDTO;

public interface FileService {
    boolean validAndSave(FileDTO fileDTO);
}
