package com.example.demo.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repo.CrudRepo;

@Service
public class CrudService {
	
	@Autowired
	private CrudRepo repo;
	
	

	public List<Student> fetchstudentList() {
		
		return repo.findAll();
	}
	
	public Student saveStudentToDB(Student student) {
		return repo.save(student);
	}
	
	public Optional<Student> fetchStudentByRegdNo(String regdno) {
		return repo.findById(regdno);
	}
	
	
	public String deleteStudentByRegdNo(String regdno) {
		String result;
	
		try {
			
			repo.deleteById(regdno);
			result = "student is successfully deleted";
		
		 }
		catch(Exception e){
			result = "invalid regdno";
		}
		
		return result;
		}	
	
	
	
	public String updateStudentByRegdNo(Student student1) {
		String result;
		
	
		try {
			 repo.findById(student1.getRegdno());
			DeleteStudentByRegdNo(student1.getRegdno());
			repo.save(student1);
			
			
			result = "updated";
		 }
		catch(Exception e){
			result = "invalid regdno";
		}
		
		return result;
		}	
	public void DeleteStudentByRegdNo(String regdno) {
		repo.deleteById(regdno);
		
	}
	
		



	
}
