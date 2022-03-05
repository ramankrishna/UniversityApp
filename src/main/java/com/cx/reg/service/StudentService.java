package com.cx.reg.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cx.reg.api.model.Student;

@Service
public class StudentService {
	
	@Autowired
	Student student;
	
	HashMap<String , Student> studentMap = new HashMap<String,Student>();
	
	public String registerStudent(String id , String name , String coursesEnrolled , String deptHead) {
	
		String[] coursesArray = coursesEnrolled.split(",");
		ArrayList<String> coursesEnrolledList = new ArrayList<String>();
		for(String str : coursesArray) {
			coursesEnrolledList.add(str);
		}
		
		
		student.setId(id);
		student.setName(name);
		student.setDeptHead(deptHead);
		student.setCoursesEnrolled(coursesEnrolledList);
		
		studentMap.put(id,student);
		
		return "The data is stored with id : "+student.getId();
	}
	
	public Object getStudentById(String id) {
		
		return studentMap.get(id);
	}
	
	public String addCourse(String id , String course) {
		
		studentMap.get(id).getCoursesEnrolled().add(course);
		
		return "The course is added:"+ course;
		
	}
	
public String deleteCourse(String id , String course) {
		
		studentMap.get(id).getCoursesEnrolled().remove(course);
		
		return "The course is delete:"+ course;
		
	}
	
	

}
