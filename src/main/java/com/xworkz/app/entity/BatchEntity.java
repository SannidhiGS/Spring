package com.xworkz.app.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "batches")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BatchEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "batch_name", nullable = false)
    private String batchName;

    @OneToMany(mappedBy = "batch", fetch = FetchType.LAZY)
    private List<StudentEntity> students;
}
