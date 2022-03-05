/**
 * 
 */
package com.cx.reg.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cx.reg.service.FacultyService;

/**
 * @author ramakrishna
 *
 */
@RestController
public class FacultyApi {
	
	@Autowired
	FacultyService facultyService;
	
	@RequestMapping(value = "/faculty/register",method = RequestMethod.POST , produces = "application/json")
	public String registerFaculty(@RequestParam("id") String id , @RequestParam("name") String name , @RequestParam("designation") String designation) {
	return facultyService.storeFacultyData(id, name, designation);
	}
	
	@RequestMapping(value = "/faculty/getbyid",method = RequestMethod.GET , produces = "application/json")
	public Object getFacultyById(@RequestParam("id") String id) {
	
		return facultyService.getFacultyByid(id);
		
	}
	
	
	
	
	
	
}
