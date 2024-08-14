package com.employeemanagementsystem.dto;

public class EmployeeDTO {

    private String name;
    private String department;

    public EmployeeDTO(String name, String department) {
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
