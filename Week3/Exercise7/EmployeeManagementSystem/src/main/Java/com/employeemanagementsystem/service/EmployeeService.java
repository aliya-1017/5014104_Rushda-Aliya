package com.employeemanagementsystem.service;

import com.employeemanagementsystem.dto.EmployeeDTO;
import com.employeemanagementsystem.projections.EmployeeNameAndDepartmentProjection;
import com.employeemanagementsystem.projections.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<EmployeeNameAndDepartmentProjection> getEmployeeNameAndDepartment() {
        return employeeRepository.findAllBy();
    }

    public List<EmployeeDTO> getEmployeeDTOs() {
        return employeeRepository.findAllEmployeeDTOs();
    }

    public List<EmployeeNameAndDepartmentProjection> getEmployeeFullNames() {
        return employeeRepository.findAllBy();
    }
}
