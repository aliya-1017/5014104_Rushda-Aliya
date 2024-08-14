package com.employeemanagementsystem.repositories;

import com.employeemanagementsystem.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Derived query methods from Exercise 3
    List<Employee> findByName(String name);
    Employee findByEmail(String email);
    List<Employee> findByDepartmentName(String departmentName);
    List<Employee> findByNameStartingWith(String prefix);
    List<Employee> findByEmailEndingWith(String domain);
    long countByDepartmentName(String departmentName);
    List<Employee> findByDepartmentId(Long departmentId);
}