package com.cx.reg.api.model;

import org.springframework.stereotype.Component;

@Component
public class Faculty {
	
	String id;
	String name;
	String designation;
	
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + name + ", designation=" + designation + "]";
	}
}
