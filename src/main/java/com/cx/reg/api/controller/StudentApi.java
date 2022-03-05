package com.cx.reg.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cx.reg.service.StudentService;

@RestController
public class StudentApi {
	
	@Autowired
	StudentService studentService;
	
	
	@RequestMapping(value="/student/register",method = RequestMethod.POST , produces = "application/json")
	public String registerStudent(@RequestParam("id") String id , @RequestParam("name") String name , @RequestParam("depthead") String depthead , @RequestParam("courses") String coursesEnrolled) {
		
		return studentService.registerStudent(id, name, coursesEnrolled, depthead);
	
	}
	
	@RequestMapping(value="/student/getbyid",method = RequestMethod.GET , produces = "application/json")
	public Object getStudentById(@RequestParam("id") String id) {
		
		return studentService.getStudentById(id);		
	
	}
	
	@RequestMapping(value="/student/addcourse",method = RequestMethod.POST , produces = "application/json")
	public String addCourse(@RequestParam("id") String id ,@RequestParam("course") String course) {
		
		return studentService.addCourse(id, course);		
	
	}
	
	@RequestMapping(value="/student/deletecourse",method = RequestMethod.POST , produces = "application/json")
	public String deleteCourse(@RequestParam("id") String id ,@RequestParam("course") String course) {
		
		return studentService.deleteCourse(id, course);		
	
	}
	
	
	
	
	
	

}
