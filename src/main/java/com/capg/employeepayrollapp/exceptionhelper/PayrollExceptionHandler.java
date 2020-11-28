package com.capg.employeepayrollapp.exceptionhelper;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.capg.employeepayrollapp.exception.EmployeeException;

@ControllerAdvice
public class PayrollExceptionHandler extends ResponseEntityExceptionHandler{
	@ExceptionHandler(EmployeeException.class)
	public ResponseEntity<String> handleEmployeeException(EmployeeException empException){
		return new ResponseEntity<>(empException.getMessage(), HttpStatus.BAD_REQUEST);
	}
}
