package com.xworkz.app.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "students")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private LocalDate dob;
    private int yearOfPassout;
    private double tenthPercentage;
    private double twelfthPercentage;
    private String degreeType;
    private double degreePercentage;
    @ManyToOne
    @JoinColumn(name = "batch_id")
    private BatchEntity batch;
}
