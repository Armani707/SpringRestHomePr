package com.example.homeproject.DTO;

import com.example.homeproject.model.Sensor;
import lombok.Data;

@Data
public class MeasurementsDto {

    private double value;

    private boolean raining;

    private Sensor sensor;
}
