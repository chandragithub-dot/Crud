package com.example.demo.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Student;

public interface CrudRepo extends JpaRepository<Student,String> {
	
	
	
	

}
