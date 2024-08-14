package com.employeemanagementsystem.repositories;

import com.employeemanagementsystem.entities.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Method to find all employees with pagination and sorting
    Page<Employee> findAll(Pageable pageable);

    // You can also add methods to search and paginate based on specific criteria
    Page<Employee> findByDepartment(String department, Pageable pageable);
}
