package com.example.homeproject.controller;

import com.example.homeproject.DTO.MeasurementsDto;
import com.example.homeproject.DTO.SensorDto;
import com.example.homeproject.model.Measurements;
import com.example.homeproject.service.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HomeController {

     @Autowired
     ServiceLayer serviceLayer;

     @PostMapping("/sensors/registration")
     public void addNewSensor (@RequestBody SensorDto dto) {
          serviceLayer.addSensor(dto);
     }

     @PostMapping("/measurements/add")
     public void addNewMeasurements (@RequestBody MeasurementsDto dto) {
          serviceLayer.addMeasurements(dto);
     }

     @GetMapping("/measurements")
     public List <Measurements> getMeasurements() {
          return serviceLayer.getMeasurements();
     }

     @GetMapping("/measurements/rainyDaysCount")
     public long rainyDayCount () {
          return serviceLayer.rainyDaysCount();
     }



}
