package com.xworkz.oops;

public class SpiceJet {
	String flights[]=new String[15];
	int index=0;
	
	public String[] addflights(String flight) {
		flights[index]=flight;
		index=index+1;
		return flights;
		
	}
	public void display(String flightname[]) {
		for (int i = 0; i < flightname.length; i++) {
			System.out.println(flights[i]);
		}
		
		
	}
	




}

	
	
	
	