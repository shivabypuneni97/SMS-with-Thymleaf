package net.javabrains.sms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javabrains.sms.entity.Student;
import net.javabrains.sms.repository.StudentRepository;
import net.javabrains.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	
	@Autowired
	private StudentRepository studentRepository;

	
@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}


@Override
public Student saveStudent(Student s) {
	
	return studentRepository.save(s);
}


@Override
public Student getStudentById(Long id) {
	
	return studentRepository.findById(id).get();
}




@Override
public Student updateStudent(Student s) {
	// TODO Auto-generated method stub
	return studentRepository.save(s);
}


@Override
public void deleteStudentById(Long id) {
	studentRepository.deleteById(id);
	
	
}
	
	}


