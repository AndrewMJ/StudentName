package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.StudentModel;
import com.example.demo.Service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService ss;
	
	@RequestMapping("/student")
	public List<StudentModel> getStudent() {
		return ss.getAllStudents();
	}
	
	@RequestMapping("/reverse")
	public List<StudentModel> getReverseStudent() {
		return ss.getReverse();
	}

}
