package com.example.homeproject.repository;

import com.example.homeproject.model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorySensor extends JpaRepository <Sensor, Integer>  {

}

