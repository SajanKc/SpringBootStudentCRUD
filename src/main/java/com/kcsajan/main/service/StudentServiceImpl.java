package com.kcsajan.main.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kcsajan.main.model.Student;
import com.kcsajan.main.repository.StudentRepository;

/**
 * @Author Sajan Kc
 * @Date February 2, 2021
 *
 */

@Service
public class StudentServiceImpl {

	@Autowired
	private StudentRepository studentRepository;

	public void createStudent(Student student) {
		studentRepository.save(student);
	}

	public List<Student> getStudent() {
		return studentRepository.findAll();
	}

	public String updateStudent(Long id, @Valid Student student) {
		Optional<Student> studentDetails = studentRepository.findById(id);
		if (studentDetails.isPresent()) {
			Student studentDb = studentDetails.get();
			studentDb.setFirstName(student.getFirstName());
			studentDb.setLastName(student.getLastName());
			studentDb.setAddress(student.getAddress());
			studentDb.setEmail(student.getEmail());
			studentDb.setPhoneNum(student.getPhoneNum());
			studentRepository.save(studentDb);
			return "Student with id " + id + " updated successfully.";
		} else {
			return "Student record not found with id " + id;
		}
	}

	public String deleteStudent(Long id) {
		Optional<Student> studentDetails = studentRepository.findById(id);
		if (studentDetails.isPresent()) {
			studentRepository.delete(studentDetails.get());
			return "Student record with id " + id + " deleted.";
		}
		return "Student with " + id + " not found.";
	}

}
