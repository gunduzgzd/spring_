package com.example.spring11data_tablecreation.repository;

import com.example.spring11data_tablecreation.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
