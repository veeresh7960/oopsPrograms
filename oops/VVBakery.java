package com.xworkz.oops;

public class VVBakery {

	public static void main(String[] args) {
		BakeryItems bakeryItems = new BakeryItems();
		bakeryItems.name = "VV Bakery";
		System.out.println(bakeryItems.name);
		
		String[] deliverFoodItems = bakeryItems.deliverFoodItems();
		System.out.println("ordered food");
		for (int i = 0; i < deliverFoodItems.length; i++) {
			System.out.println(deliverFoodItems[i]);
		}

	}

}
