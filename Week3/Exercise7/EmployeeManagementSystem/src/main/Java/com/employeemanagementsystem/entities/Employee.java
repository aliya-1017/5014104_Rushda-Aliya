package com.employeemanagementsystem.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee extends com.employeemanagementsystem.entities.Auditable<String> {

    private String name;
    private String department;

    // Default constructor
    public Employee() {}

    // Custom constructor
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
