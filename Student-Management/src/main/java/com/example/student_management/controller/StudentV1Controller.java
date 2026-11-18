package com.example.student_management.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.student_management.dto.StudentV1ResponseDTO;
import com.example.student_management.service.StudentService;

@Controller
@RequestMapping("/api/v1/students")
public class StudentV1Controller {
	
	private StudentService studentService;

	public StudentV1Controller(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<StudentV1ResponseDTO> findStudent(@PathVariable int id){
		StudentV1ResponseDTO studentV1 = studentService.getStudentV1(id);
		return new ResponseEntity<>(studentV1,HttpStatus.OK);
	}
	
}
