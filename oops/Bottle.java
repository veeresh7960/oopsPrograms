package com.xworkz.oops;

public class Bottle {
	String brand;
	int price;
	int litre;
	boolean coldOrWarm;
	

	
	public Bottle(String brand, int price) {
		System.out.println("inside constructor");
		this.brand = brand;
		this.price = price;
		
	}
	public Bottle(String brand, int price, int litre, boolean coldOrWarm) {
		this(brand,price);
		this.litre = litre;
		this.coldOrWarm = coldOrWarm;
	}
	public void Drinking() {
		System.out.println("he is drinking");
	}
	public void Washing() {
		System.out.println("we can use washing");
	}
	
}

class Bottle2 extends Bottle {
	boolean isCupper;
	
public Bottle2(String brand, int price, int litre, boolean coldOrWarm) {
		super(brand, price, litre, coldOrWarm);
		//this.isCupper=isCupper;
	}

	
}



