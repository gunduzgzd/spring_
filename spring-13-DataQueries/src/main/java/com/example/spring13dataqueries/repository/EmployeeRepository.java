package com.example.spring13dataqueries.repository;

import com.example.spring13dataqueries.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


    //display all employees with email address

    List<Employee> findByEmail(String email);

    //display all employees with firstname "" and last name"",
    //also show all employees with an email address""

    List<Employee> findByFirstNameAndLastNameOrEmail(String firstname, String lastname, String email);

    //display all employees that first name is not""

    List<Employee> findByFirstNameIsNot(String name);

    //display all employees where last name starts with

    List<Employee> findByLastNameStartingWith(String pattern);

    //display all employees with salaries less than ""

    List<Employee> findBySalaryLessThan(Integer salary);

    //display all employees with salaries higher than ""

    List<Employee> findBySalaryGreaterThan(Integer salary);

    //display all employees that has been hired between "" and ""

    List<Employee> findByHireDateBetween(LocalDate startDate, LocalDate endDate);

    //display all employees where salaries greater and equel to "" in order-salary

    List<Employee>  findBySalaryGreaterThanEqualOrderBySalary(Integer salary);

    //display top unique 2 employees that is making less than ""

    List<Employee> findDistinctTop3BySalaryLessThan(Integer salary);

    //display all employees that do not have email address

    List<Employee> findByEmailIsNull();


    @Query("SELECT employee FROM Employee employee where employee.email='jcassamrr@cam.ac.uk'")
    Employee retrieveEmployeeDetail();

   @Query("SELECT e.salary from Employee e where e.email='jcassamrr@cam.ac.uk'")
    Integer retrieveEmployeeSalary();


}
