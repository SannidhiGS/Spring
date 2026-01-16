package com.xworkz.app.dto;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BatchDTO {
    private int id;
    private String batchName;
    private MultipartFile logo; // for file upload
}
