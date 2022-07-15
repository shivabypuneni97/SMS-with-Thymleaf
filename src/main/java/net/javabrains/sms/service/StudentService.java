package net.javabrains.sms.service;

import java.util.List;

import net.javabrains.sms.entity.Student;


public interface StudentService {
	
	List<Student> getAllStudents();
	
	Student saveStudent(Student s);
	
	Student getStudentById(Long Id);
	
	
	Student updateStudent(Student s);
	
	void deleteStudentById(Long id);

	

}
