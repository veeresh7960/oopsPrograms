package com.xworkz.oops;

 class Laptops {

	String Brand;
	String memory;
	String Version;
	int batterycapacity;
	String microprocessor;
	int price;
	String Os;

	public void printInfo() {
		System.out.println("laptop brand is : " + Brand  + " memory is: " + memory + " version is: " + Version + " battery: "
				+ batterycapacity + " " + "Mp is:" + microprocessor + "price is: " + price + " os is: " + Os);
	}

public class  Laptop{
	public void main(String[] args) {
	Laptops laptops	=new Laptops();
	laptops.Brand=" Dell ";
	laptops.memory=" 1Tb ";
	laptops.Version=" 5th ";
	laptops.batterycapacity=1300 ;
	laptops.microprocessor=" intel i5 ";
	laptops.price=46000;
	laptops.Os=" windows";
	laptops.printInfo();
	
	}
	
	}
	
 }
