/**
 * 
 */
package com.cx.reg.api.model;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

/**
 * @author ramakrishna
 *
 */
@Component
public class Student {
	
	String id;
	String name;
	String deptHead;
	ArrayList<String> coursesEnrolled;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeptHead() {
		return deptHead;
	}
	public void setDeptHead(String deptHead) {
		this.deptHead = deptHead;
	}
	public ArrayList<String> getCoursesEnrolled() {
		return coursesEnrolled;
	}
	public void setCoursesEnrolled(ArrayList<String> coursesEnrolled) {
		this.coursesEnrolled = coursesEnrolled;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", deptHead=" + deptHead + ", coursesEnrolled="
				+ coursesEnrolled + "]";
	}
	
	
	

}
