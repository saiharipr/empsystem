package com.hdfc.emp.capstone.ems.project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


import lombok.extern.slf4j.Slf4j;
@RestControllerAdvice
@Slf4j
public class GlobalExceptionhandler {

	
	
	@ExceptionHandler(InValidEmployeeIDException.class)
	public ResponseEntity<String> handleEmployeeNotFoundException(InValidEmployeeIDException ex) {
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
	}

}
