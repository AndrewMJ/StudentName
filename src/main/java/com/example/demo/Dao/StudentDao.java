package com.example.demo.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.Model.StudentModel;



@Component
public class StudentDao {
	
	private List<StudentModel> list = new ArrayList<StudentModel>();
	
	public StudentDao() {
		list.add(new StudentModel("Drew", "Jackson"));
		list.add(new StudentModel("Tom", "Hanks"));
		list.add(new StudentModel("Tim", "Allen"));
		list.add(new StudentModel("Will", "Smith"));
	}
	
	public List<StudentModel>getAllStudents(){
		return list;
	}

}
