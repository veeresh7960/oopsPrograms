package com.xworkz.oops;

public class Wildcraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bags bags = new Bags();
		bags.Brand="wildcraft";
		bags.color="blue";
		bags.type="collage";
		bags.capacity=30;
		bags.price=1000;
		bags.weight=2;
		
		System.out.println(bags.Brand);
		System.out.println(bags.color);
		System.out.println(bags.type);
		System.out.println(bags.capacity);
		bags.storebook();

}
	
}
