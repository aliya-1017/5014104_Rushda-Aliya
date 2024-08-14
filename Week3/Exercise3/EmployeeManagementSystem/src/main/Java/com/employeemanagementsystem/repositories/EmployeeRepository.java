package com.employeemanagementsystem.repositories;

import com.employeemanagementsystem.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Find employees by their name
    List<Employee> findByName(String name);

    // Find employees by their email
    Employee findByEmail(String email);

    // Find all employees in a specific department
    List<Employee> findByDepartmentName(String departmentName);

    // Find employees whose name starts with a specific prefix
    List<Employee> findByNameStartingWith(String prefix);

    // Find employees whose email ends with a specific domain
    List<Employee> findByEmailEndingWith(String domain);

    // Count the number of employees in a specific department
    long countByDepartmentName(String departmentName);

    // Find employees by department ID
    List<Employee> findByDepartmentId(Long departmentId);
}
