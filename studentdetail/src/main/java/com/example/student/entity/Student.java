package com.example.student.entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;

@Entity
public class Student {
	
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Integer stuId;
       private String name;
       private String email;
       private String phoneNo;
       private String address;
       
        
	public Student() {
		super();
	}
	

	public Student(String name, String email, String phoneNo, String address) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.address = address;
	}

	
	public Integer getStuId() {
		return stuId;
	}


	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}


	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
