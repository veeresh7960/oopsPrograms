package com.xworkz.oops;

public class Hero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Bike bike = new Bike();
	bike.Brand="hero";
	bike.modelname="hero-12";
	bike.modelnumber=1243561;
	bike.enginecc=200;
	bike.color="blue and white";
	bike.price=56000;
	bike.brake="doubledisk";
		
	System.out.println(bike.Brand);
	bike.riding();
	bike.transpotation();
	bike.serviceses();
	}

}
