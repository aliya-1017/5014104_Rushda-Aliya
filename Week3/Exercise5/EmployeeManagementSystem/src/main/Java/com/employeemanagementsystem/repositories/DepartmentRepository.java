package com.employeemanagementsystem.repositories;

import com.employeemanagementsystem.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    // Derived query methods from Exercise 3
    Department findByName(String name);
    List<Department> findByNameContaining(String namePart);
    long count();
    Optional<Department> findById(Long id);
}