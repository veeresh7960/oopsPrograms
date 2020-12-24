package com.xworkz.oops; 
class StudentClass {

	public static void main(String[] args) {
		StudentDetails s1 = new StudentDetails("veeresh",27,"3vc16ec104");
		System.out.println(s1.name);
		System.out.println(s1.rollNo);
		StudentDetails s2 = new StudentDetails("ramesh",28,"3vc16ec105");
		System.out.println(s2.name);
		System.out.println(s2.rollNo);
		StudentDetails s3 = new StudentDetails();
		s3.setName("veeresh");
		System.out.println(s3.getName());
		
		
		
	}

}
