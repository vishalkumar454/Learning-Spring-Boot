package com.example.student_management.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.student_management.dto.StudentRequestDTO;
import com.example.student_management.dto.StudentResponseDTO;
import com.example.student_management.dto.StudentV1ResponseDTO;
import com.example.student_management.dto.StudentV2ResponseDTO;
import com.example.student_management.entity.Student;
import com.example.student_management.exception.InvalidAgeException;
import com.example.student_management.repository.StudentRepository;

@Service
public class StudentService {
	
	private StudentRepository studentRepository;
	private ModelMapper modelMapper;

	public StudentService(StudentRepository studentRepository, ModelMapper modelMapper) {
		this.studentRepository = studentRepository;
		this.modelMapper = modelMapper;
	}



	public StudentResponseDTO saveStudent(StudentRequestDTO requestDTO) {
		if(requestDTO.getAge() < 18)
			throw new InvalidAgeException("age is less than 18");
		
//		Student student = new Student();
//		student.setAge(requestDTO.getAge());
//		student.setEmail(requestDTO.getEmail());
//		student.setName(requestDTO.getName());
//		student.setPassword(requestDTO.getPassword());
		
		Student student = modelMapper.map(requestDTO, Student.class);
		
		
		Student savedStudent = studentRepository.save(student);
		
		StudentResponseDTO responseDTO = modelMapper.map(savedStudent, StudentResponseDTO.class);
		
//		StudentResponseDTO responseDTO = new StudentResponseDTO();
//		
//		responseDTO.setAge(savedStudent.getAge());
//		responseDTO.setEmail(savedStudent.getEmail());
//		responseDTO.setName(savedStudent.getName());
		
		return responseDTO;
	}
	
	
	public StudentV1ResponseDTO getStudentV1(int id) {
		Student student = studentRepository.findById(id).get();
		return modelMapper.map(student, StudentV1ResponseDTO.class);
	}
	
	public StudentV2ResponseDTO getStudentV2(int id) {
		Student student = studentRepository.findById(id).get();
		return modelMapper.map(student, StudentV2ResponseDTO.class);
	}
	
}
