package com.xworkz.veggi.dto;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class VeggiDTO {
    private int id;
    private String name;
    private String color;
    private double price;
    private String season;
}
