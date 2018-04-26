package com.example.demo.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Dao.StudentDao;
import com.example.demo.Model.StudentModel;

@Component
public class StudentService {
	
	@Autowired
	StudentDao dao;
	
	public List<StudentModel>getAllStudents(){
		return dao.getAllStudents();
	}
	
	public List<StudentModel>getReverse(){
		List<StudentModel> reverse = dao.getAllStudents();
		
		reverse.sort(new Comparator<StudentModel>() {
			@Override
			public int compare(StudentModel s1, StudentModel s2) {
				if(s1.getLastName().compareTo(s2.getLastName()) > 0) {
					return -1;
				}
				else
					return 1;
			}
		});
		return reverse;
		
	}
		

}
