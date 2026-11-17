package com.example.demo_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo_springboot.controller.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
