package com.example.homeproject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "measurements")
@AllArgsConstructor
@NoArgsConstructor
public class Measurements {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double value;

    private boolean raining;

    @JsonIgnore
    @JoinColumn(name = "sensor_id", referencedColumnName = "id")
    @ManyToOne(cascade = CascadeType.ALL)
    private Sensor sensor;


}
