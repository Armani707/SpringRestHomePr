package com.example.homeproject.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "sensor")
@Data
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany (mappedBy = "sensor", cascade = CascadeType.ALL)
    private List <Measurements> measurements;
}
