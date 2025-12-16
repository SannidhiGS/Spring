package com.xworkz.fuel.dto;

import lombok.*;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FuelDTO {
    private String name;
    private String location;
    private String barcode;
    private String fuelType;
}
