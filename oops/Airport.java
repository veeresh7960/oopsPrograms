package com.xworkz.oops;

public class Airport {

	public static void main(String[] args) {
Flight flight = new Flight("Deccan Air",11,"37873djkd",1000,"genaral");
	
	System.out.println(flight.getEngineSpeed());
	System.out.println(flight.getPrice());
	System.out.println(flight.getModelName());
	Flight flight2=new Flight("AirIndia",10,"12127d",5000,"general");
	System.out.println(flight2.getEngineSpeed());
	System.out.println(flight2.getPrice());
	System.out.println(flight2.getModelName());
	
	Flight flight3=new Flight("AirUdan",8, "328274dhs", 1500,"general");
	System.out.println(flight3.getEngineSpeed());
	System.out.println(flight3.getPrice());
	System.out.println(flight3.getModelName());
	
	Flight flight4 = new Flight ("jarr",9,"32896dkjh",2000,"general");
	System.out.println(flight4.name);
	System.out.println(flight4.price);
	System.out.println(flight4.modelName);
	
	Flight flight5=new Flight("kingFisher", 15, "23838akj", 1500, "general");
	System.out.println(flight5.name);
	System.out.println(flight5.price);
	System.out.println(flight5.modelName);
		
	}

}
