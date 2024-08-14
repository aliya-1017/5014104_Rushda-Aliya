package com.employeemanagementsystem;

import com.employeemanagementsystem.entities.Department;
import com.employeemanagementsystem.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeeManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(DepartmentRepository departmentRepository) {
		return (args) -> {
			// Create a new department
			Department department = new Department("HR");
			departmentRepository.save(department);

			System.out.println("Created Department:");
			System.out.println("Name: " + department.getName());
			System.out.println("Created By: " + department.getCreatedBy());
			System.out.println("Created Date: " + department.getCreatedDate());

			// Simulate an update
			department.setName("Human Resources");
			departmentRepository.save(department);

			System.out.println("Updated Department:");
			System.out.println("Name: " + department.getName());
			System.out.println("Last Modified By: " + department.getLastModifiedBy());
			System.out.println("Last Modified Date: " + department.getLastModifiedDate());
		};
	}
}
