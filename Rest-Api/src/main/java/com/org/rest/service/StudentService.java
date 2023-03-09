package com.org.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.rest.model.Student;
import com.org.rest.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	public StudentRepository studRepo;

	public List<Student> getAllStudent() {
		List<Student> studs=new ArrayList<>();
		studRepo.findAll().forEach(stud->studs.add(stud));
		return studs;
	}

	public void addStudent(Student stud) {
		studRepo.save(stud);

	}

	public Student getStudent(Long id) {
		return studRepo.findById(id).get();
	}

	public void updateStudent(Student stud) {
		studRepo.save(stud);

	}

	public void deleteStudent(Long id) {
		studRepo.deleteById(id);

	}

}


	