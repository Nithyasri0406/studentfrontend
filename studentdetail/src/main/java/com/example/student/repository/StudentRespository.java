package com.example.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student.entity.Student;

public interface StudentRespository extends JpaRepository <Student ,Integer>{

	

}
