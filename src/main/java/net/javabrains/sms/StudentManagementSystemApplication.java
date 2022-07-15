package net.javabrains.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javabrains.sms.entity.Student;
import net.javabrains.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
		// TODO Auto-generated method stub

	}
    @Autowired 
    private StudentRepository studentRepository;
    
	@Override
	public void run(String... args) throws Exception {
		
	/*
		
		Student s1= new Student(45,"raghu","poluri", "poluri@gmail.com");
		studentRepository.save(s1);
		
		Student s2= new Student(9,"gopi","sompalli", "sompalli@gmail.com");
		studentRepository.save(s2);
		
		Student s3= new Student(15,"sivakrishna","bypuneni", "bskc@gmail.com");
		studentRepository.save(s3);
		*/
	}
	
	

}
