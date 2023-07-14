package com.example.homeproject.service;

import com.example.homeproject.DTO.MeasurementsDto;
import com.example.homeproject.DTO.SensorDto;
import com.example.homeproject.model.Measurements;
import com.example.homeproject.model.Sensor;
import com.example.homeproject.repository.RepositoryMeasurements;
import com.example.homeproject.repository.RepositorySensor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class ServiceLayer {

    @Autowired
    RepositorySensor sensorRepository;

    @Autowired
    RepositoryMeasurements repositoryMeasurements;

    public void addSensor(SensorDto dto) {
        Sensor sensor = new Sensor();
        sensor.setName(dto.getName());
        sensorRepository.save(sensor);
    }

    public void addMeasurements(MeasurementsDto dto) {
        Measurements measurements = new Measurements();
        measurements.setValue(dto.getValue());
        measurements.setRaining(dto.isRaining());
        measurements.setSensor(dto.getSensor());

        repositoryMeasurements.save(measurements);
    }


    public List<Measurements> getMeasurements() {
        return repositoryMeasurements.findAll();
    }

    public long rainyDaysCount() {
     return repositoryMeasurements.findAll().stream().filter(s -> s.isRaining()).count();
    }
}
