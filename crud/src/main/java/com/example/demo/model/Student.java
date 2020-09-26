package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@Column(name="RegdNo")
	private String regdno;
	@Column(name="Name")
	private String name;
	@Column(name="Standard")
	private String standard;
	@Column(name = "Age")
	private int age;
	
	public Student() {
		
	}
	
	
	public Student(String name, String regdno, String standard,int age) {
		super();
		this.name = name;
		this.regdno = regdno;
		this.standard = standard; 
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegdno() {
		return regdno;
	}
	public void setRegdno(String regdno) {
		this.regdno = regdno;
	}
	public String getStandard() {
		return standard;
	}


	public void setStandard(String standard) {
		this.standard = standard;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
