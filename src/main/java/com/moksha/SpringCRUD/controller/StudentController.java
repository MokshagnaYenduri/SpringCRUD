package com.moksha.SpringCRUD.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moksha.SpringCRUD.model.Student;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@PostMapping("/students")
	public void saveData(@RequestBody Student student) {
		System.out.println(student);
	}
}
