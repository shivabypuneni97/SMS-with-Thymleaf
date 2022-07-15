package net.javabrains.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.javabrains.sms.entity.Student;
import net.javabrains.sms.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	

	// create a method to handle students list and return model,view
	@GetMapping("/students")
	public String listStudents(Model model) {
	model.addAttribute("students", studentService.getAllStudents());
	return "students";
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		
		// to hold student form data create student object
		Student s =new Student();
		model.addAttribute("student",s);
		return "create_student";
		
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student s) {
		studentService.saveStudent(s);
		return "redirect:/students";
	}
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id,Model model) {
		
		model.addAttribute("student",studentService.getStudentById(id));
	     return "edit_student";
	 }
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,
			                     @ModelAttribute("student") Student s,
			                      Model model) {
		
		// get student from database by id
		
		Student existingStudent=studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirstname(s.getFirstname());
		existingStudent.setLastname(s.getLastname());
		existingStudent.setEmail(s.getEmail());
		
		
		//save updated student object
		
		studentService.updateStudent(existingStudent);
		return "redirect:/students";
	}
	
	//handler method to delete student feature
	
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		
		studentService.deleteStudentById(id);
		return "redirect:/students";
}
}
