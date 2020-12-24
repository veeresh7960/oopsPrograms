package com.xworkz.oops;

public class Mainmethodvalues {

	public static void main(String[] args) {
		
				Student student = new Student();
				student.setStudent_Id(27);
				student.setName("veeresh");
				System.out.println(student);
				System.out.println(student.toString());
				System.out.println(student.hashCode());
				System.out.println(student.equals(student));
				System.out.println(student.getClass());
			System.out.println("student data: " +" \n student ID:  " + student.getStudent_Id()+  " \n student name :" + student.getName());
			}
	}


