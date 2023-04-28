package com.hdfc.emp.capstone.ems.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hdfc.emp.capstone.ems.project.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
