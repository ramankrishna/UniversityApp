package com.cx.reg.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cx.reg.api.model.Faculty;


@Service
public class FacultyService {
	
	@Autowired
	Faculty faculty;
	
	HashMap<String,Faculty> facultyMap = new HashMap<String,Faculty>();
	
	public String storeFacultyData(String id , String name, String designation) {
		
		faculty.setId(id);
		faculty.setName(name);
		faculty.setDesignation(designation);
		
		facultyMap.put(id, faculty);
		
		return "The data is stored with id: "+faculty.getId();
	}
	
	public Object getFacultyByid(String id) {
		
		return facultyMap.get(id);
		
	}

	
}
