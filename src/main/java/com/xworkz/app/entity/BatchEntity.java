package com.xworkz.app.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "batches")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BatchEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "batch_name")
    private String batchName;

    @Column(name = "batch_logo")
    private String batchLogo;
}
