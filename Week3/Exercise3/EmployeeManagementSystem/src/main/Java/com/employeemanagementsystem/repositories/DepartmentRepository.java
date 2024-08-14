package com.employeemanagementsystem.repositories;

import com.employeemanagementsystem.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    // Find a department by its name
    Department findByName(String name);

    // Find departments by a part of their name
    List<Department> findByNameContaining(String namePart);

    // Count the number of departments
    long count();

    // Find a department by ID
    Optional<Department> findById(Long id);
}
