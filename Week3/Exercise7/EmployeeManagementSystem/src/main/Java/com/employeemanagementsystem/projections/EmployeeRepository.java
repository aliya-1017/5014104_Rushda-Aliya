package com.employeemanagementsystem.projections;

import com.employeemanagementsystem.dto.EmployeeDTO;
import com.employeemanagementsystem.entities.Employee;
import com.employeemanagementsystem.repositories.EmployeeFullNameProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<EmployeeNameAndDepartmentProjection> findAllBy();
    @Query("SELECT new com.employeemanagementsystem.dto.EmployeeDTO(e.name, e.department) FROM Employee e")
    List<EmployeeDTO> findAllEmployeeDTOs();
}
