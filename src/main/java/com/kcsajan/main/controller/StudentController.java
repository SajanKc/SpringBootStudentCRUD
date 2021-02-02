package com.kcsajan.main.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kcsajan.main.model.Student;
import com.kcsajan.main.service.StudentServiceImpl;

/**
 * @Author Sajan Kc
 * @Date February 2, 2021
 *
 */

@RestController
@RequestMapping("/api/v1")
public class StudentController {

	@Autowired
	private StudentServiceImpl studentServiceImpl;

	@PostMapping("/students")
	public String createStudent(@Valid @RequestBody Student student) {
		studentServiceImpl.createStudent(student);
		return "New record added successfully !!!";
	}

	@GetMapping("/students")
	public List<Student> getStudent() {
		return studentServiceImpl.getStudent();
	}

	@PutMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id, @Valid @RequestBody Student student) {
		return studentServiceImpl.updateStudent(id, student);
	}

	@DeleteMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		return studentServiceImpl.deleteStudent(id);
	}

}
