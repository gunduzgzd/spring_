package com.example.spring11data_tablecreation.repository;

import com.example.spring11data_tablecreation.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository -->  optional
public interface CarRepository extends JpaRepository<Car,Long> {



}
