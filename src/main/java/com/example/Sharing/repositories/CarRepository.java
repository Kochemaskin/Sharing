package com.example.Sharing.repositories;

import com.example.Sharing.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    Car findById(long id);

    Car findByNumber(String number);
}