package com.employeemanagementsystem.repositories;

import com.employeemanagementsystem.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // This method corresponds to the "Employee.findByName" named query
    List<Employee> findByName(@Param("name") String name);

    // This method corresponds to the "Employee.findByDepartmentName" named query
    List<Employee> findByDepartmentName(@Param("departmentName") String departmentName);
}
