package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Student;
import com.example.demo.services.CrudService;


@RestController
public class CrudRestController {
	
	@Autowired
	private CrudService service;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/getstudentlist")
	public List<Student> fetchStudentList(){
		List<Student> students = new ArrayList<Student>();
		students = service.fetchstudentList();
		return students;
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/addstudent/{student}")
	public Student saveStudent(@RequestBody Student student){
		
		return service.saveStudentToDB(student);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/getstudentbyregdno/{regdno}")
	public Student fetchStudentByRegdNo(@PathVariable String regdno){
		
		return service.fetchStudentByRegdNo(regdno).get();
		
		}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/deletestudentbyregdno/{regdno}")
	public String deleteStudentByRegdNo(@PathVariable String regdno){
		
		return service.deleteStudentByRegdNo(regdno);
	
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/update/{regdno}")
	public String updateStudentByRegdNo(@RequestBody Student student){
		
		return service.updateStudentByRegdNo(student);
	}
	
	
	

}
