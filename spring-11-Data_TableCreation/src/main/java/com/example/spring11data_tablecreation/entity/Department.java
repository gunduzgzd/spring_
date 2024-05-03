package com.example.spring11data_tablecreation.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "departments")
@NoArgsConstructor
@Data
public class Department extends BaseEntity{

    private String name;
    private String division;

    public Department(String name, String division) {
        this.name = name;
        this.division = division;
    }
}
