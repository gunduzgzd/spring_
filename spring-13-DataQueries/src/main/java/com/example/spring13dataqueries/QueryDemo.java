package com.example.spring13dataqueries;

import com.example.spring13dataqueries.repository.DepartmentRepository;
import com.example.spring13dataqueries.repository.EmployeeRepository;
import com.example.spring13dataqueries.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class QueryDemo implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;

    public QueryDemo(RegionRepository regionRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("___________REGIONS____________");

        System.out.println("findByCountry:" + regionRepository.findByCountry("Canada"));

        System.out.println("findByCountry:" + regionRepository.findByCountryContains("United"));

        System.out.println("findByCountry:" + regionRepository.findByCountryContainsOrderByRegion("United"));

        System.out.println(regionRepository.findTopByCountry("United States"));

        System.out.println(regionRepository.findTop2ByCountry("United States"));

        System.out.println(regionRepository.findTopByCountryContainsOrderByRegion("United States"));

        System.out.println("____________DEPARTMENTS___________");

        System.out.println(departmentRepository.findByDepartment("Furniture"));

        System.out.println(departmentRepository.findByDivision("Health"));

        System.out.println(departmentRepository.findByDivisionEndingWith("ics"));

        System.out.println(departmentRepository.findDistinctTopByDivisionContains("Hea"));

        System.out.println("_____________EMPLOYEE__________________");

        System.out.println(employeeRepository.retrieveEmployeeDetail());














    }
}
