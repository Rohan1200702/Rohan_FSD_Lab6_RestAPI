package com.gl.studentManagement.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gl.studentManagement.entity.Student;
import com.gl.studentManagement.repository.StudentRepository;


@Repository
public class StudentServiceImp implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	@Transactional
	public List<Student> findAll() {
		List<Student> students = studentRepository.findAll();
		return students;
	}

	@Override
	public Student findById(int id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public void save(Student student) {
		studentRepository.save(student);
	}

	@Override
	public void deleteById(int id) {
		studentRepository.deleteById(id);

	}

}
