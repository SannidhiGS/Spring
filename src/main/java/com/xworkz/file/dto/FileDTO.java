package com.xworkz.file.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class FileDTO {
    private int fileID;
    private String fileName;
    private String getFileSize;

}
