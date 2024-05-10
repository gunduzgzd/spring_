package com.example.spring13dataqueries.repository;

import com.example.spring13dataqueries.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, String> {

    //display all departments in the furniture department

    List<Department> findByDepartment(String department);

    //display all departments in the health division

    List<Department> findByDivision(String division);

    List<Department> findByDivisionIs(String division);

    List<Department> findByDivisionEquals(String division);

    //display  all departments with division name ends with 'ics'

    List<Department> findByDivisionEndingWith(String pattern);

    //display top 3 departments with division name include 'Hea' without duplicates

    List<Department> findDistinctTopByDivisionContains(String pattern);





}
