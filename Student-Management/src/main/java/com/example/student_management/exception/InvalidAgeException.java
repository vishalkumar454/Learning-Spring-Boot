package com.example.student_management.exception;

public class InvalidAgeException extends RuntimeException{
	
	public InvalidAgeException(String massage) {
		super(massage);
	}

}
