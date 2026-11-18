package com.example.student_management.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobelExceptionHandler {
	
	@ExceptionHandler(InvalidAgeException.class)
	public ResponseEntity<String> handleInvalidAgeException(InvalidAgeException ageException){
		return new ResponseEntity<String>(ageException.getMessage(),HttpStatus.BAD_REQUEST);
	}
}
