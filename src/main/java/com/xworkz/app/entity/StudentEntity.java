package com.xworkz.app.entity;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "students")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dob;

    private Integer yearOfPassout;
    private Double tenthPercentage;
    private Double twelfthPercentage;
    private String degreeType;
    private Double degreePercentage;

    @ManyToOne
    @JoinColumn(name = "batch_id")
    private BatchEntity batch;
}
