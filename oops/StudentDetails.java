package com.xworkz.oops;

public class StudentDetails {
	String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	int rollNo;
	String id;
	public StudentDetails(String name, int rollNo, String id) {
		this.name = name;
		this.rollNo = rollNo;
		this.id = id;
	}
	public StudentDetails() {
	
	}
	

}
