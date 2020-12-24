package com.xworkz.oops;

public class BakeryItems {
	String name;
	
	public void disp() {
		System.out.println("name of the bakery"+name);

}
	public void takeAnOrder(String foodItems[]) {
		System.out.println("order accepted list of food items are");
		for (int i = 0; i < foodItems.length; i++) {
			System.out.println(foodItems[i]);
		}
		
	}
public String[] deliverFoodItems() {
	String preparefood[]= {"butter biscut","puff","tost"};
	return preparefood;
}


}