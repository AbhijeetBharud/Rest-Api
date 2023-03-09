package com.org.rest.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.org.rest.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

	Optional<Student> findById(Long id);

	void deleteById(Long id);

	

}
