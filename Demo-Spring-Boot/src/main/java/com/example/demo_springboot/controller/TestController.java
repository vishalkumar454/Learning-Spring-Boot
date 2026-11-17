package com.example.demo_springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo_springboot.controller.entity.Student;
import com.example.demo_springboot.repository.StudentRepository;

@Controller
public class TestController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@PostMapping("/register")
	public String readData(@ModelAttribute Student student, Model model) {
		
		studentRepository.save(student);
		
//		model.addAttribute("name", student.getName());
//		model.addAttribute("age", student.getAge());
//		model.addAttribute("email", student.getEmail());
		
//		return "display.html";
		return "success.html";
	}
}
