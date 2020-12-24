package com.xworkz.oops;

public class Employ {  
	final private String name = "veeresh";

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	final private int age = 23;
//	 public void setAge(int age) {
//		this.age = age;
//	}

//	public void setPhoneNo(long phoneNo) {
//		this.phoneNo = phoneNo;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}

	final private long phoneNo = 217096590;
	final private int id = 777;

	public void Employ(String name, int age, long phoneNo, int id) {
//		this.name = name;
//		this.age = age;
//		this.phoneNo = phoneNo;
//		this.id = id;
		System.out.println("name of employ = " + name + "ageof the employ = " + age);
	}

	public int getAge() {
		return age;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public int getId() {
		return id;
	}
}
