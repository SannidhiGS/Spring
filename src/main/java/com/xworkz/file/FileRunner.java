package com.xworkz.file;

import com.xworkz.file.config.CoreConfig;
import com.xworkz.file.dao.FileDAO;
import com.xworkz.file.dto.FileDTO;
import com.xworkz.file.service.FileService;
import com.xworkz.file.service.impl.FileServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FileRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(CoreConfig.class);
        FileDTO fileDTO=new FileDTO();
        fileDTO.setFileID(4);
        fileDTO.setFileName("Sannidhi");
        fileDTO.setGetFileSize("200Kb");
        System.out.println(fileDTO);
        FileService fileService=applicationContext.getBean(FileService.class);
        System.out.println(fileService);
        fileService.validAndSave(fileDTO);
    }
}
