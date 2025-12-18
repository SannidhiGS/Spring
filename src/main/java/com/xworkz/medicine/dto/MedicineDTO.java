package com.xworkz.medicine.dto;

import lombok.*;
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MedicineDTO {
    private int id;
    private String name;
    private String mg;
    private String expiry;
    private String composition;
}
