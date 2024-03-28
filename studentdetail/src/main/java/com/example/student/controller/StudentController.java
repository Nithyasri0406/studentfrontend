package com.example.student.controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.student.entity.Student;
import com.example.student.repository.StudentRespository;
@RestController
@RequestMapping("/student")
@CrossOrigin(origins ="http://localhost:4200")
public class StudentController {
	@Autowired
	StudentRespository repos;
	
	
	
	 @PostMapping
     public Student add(@RequestBody Student d)
     {
		 
    
    	 return repos.save(d);
     }
	 
	 @GetMapping
	 public List<Student> getStudents()
	 {
		return repos.findAll();
	 }
	 @GetMapping("/{stuId}")
	 public Student getstudentbyid(@PathVariable Integer stuId)
	 {
		 return repos.findById(stuId).get();
	 }
	 @DeleteMapping("/{stuId}")
	 public void Deletestudent(@PathVariable Integer stuId)
	 {
		 repos.deleteById(stuId);
	 }
	 @PutMapping("/{stuId}")
	 public Student Updatestudent(@PathVariable Integer stuId,@RequestBody Student d)
	 {
		 d.setStuId(stuId);
		 return repos.save(d);
	 }
}
 