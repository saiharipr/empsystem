package com.hdfc.emp.capstone.ems.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.emp.capstone.ems.project.exception.InValidEmployeeIDException;
import com.hdfc.emp.capstone.ems.project.sevice.EmployeeService;
import com.hdfc.emp.capstone.ems.project.vo.EmployeeVO;


import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
@RequestMapping("/Capstone/Employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	

	@GetMapping("/get/{employeeID}")
	public EmployeeVO getEmployeeById(@PathVariable long employeeID) throws InValidEmployeeIDException {
		
		logger.info("getByEmployeeById:{}called",employeeID);

		return employeeService.getEmployeeById(employeeID);
	}

}
