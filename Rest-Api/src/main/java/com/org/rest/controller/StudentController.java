package com.org.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.rest.model.Student;
import com.org.rest.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentService studService;
	
	
	@GetMapping("/students")
	public List<Student> getAllStudent(){
		return studService.getAllStudent();
	}
   
   @GetMapping("/student/{id}")
   public Student getStudent(@PathVariable("id") Long id) {
      return studService.getStudent(id);
   }
   @DeleteMapping("/student/{id}")
   public void deleteStudent(@PathVariable("id") Long id) {
      studService.deleteStudent(id);
   }
   @PostMapping("/student")
   public void addBook(@RequestBody Student stude) {
      studService.addStudent(stude);   
   }
   @PutMapping("/student")
   public void updateBook(@RequestBody Student studen) {
      studService.updateStudent(studen);
   }

}
