package com.employeemanagementsystem.controllers;
import com.employeemanagementsystem.projections.EmployeeNameAndDepartmentProjection;
import com.employeemanagementsystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees/name-department")
    public List<EmployeeNameAndDepartmentProjection> getEmployeeNameAndDepartment() {
        return employeeService.getEmployeeNameAndDepartment();
    }
}
