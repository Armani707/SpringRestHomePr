package com.example.homeproject.repository;

import com.example.homeproject.model.Measurements;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryMeasurements extends JpaRepository <Measurements, Integer> {
}
