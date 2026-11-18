package com.example.student_management.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.student_management.dto.StudentV2ResponseDTO;
import com.example.student_management.service.StudentService;

@Controller
@RequestMapping("/api/v2/students")
public class StudentV2Controller {
	
	private StudentService studentService;

	public StudentV2Controller(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<StudentV2ResponseDTO> findStudent(@PathVariable int id){
		StudentV2ResponseDTO studentV2 = studentService.getStudentV2(id);
		return new ResponseEntity<>(studentV2,HttpStatus.OK);
	}
}
