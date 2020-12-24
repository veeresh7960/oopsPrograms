package com.xworkz.oops;

 public class Ac {
	String Brand;
	String color;
	String modelname;
	int coolingcapacity;
	String type;
	int price;
	int weight;

	public void printInfo() {
		System.out.println("ac brand is : " + Brand  + "color  is: " + color + " modelname is: " + modelname + " cooling in W: "
				+ coolingcapacity + " " + "type is:" + type + "price is: " + price + " weight in kg: " + weight);
	}
// }
//public class Samsung{
	public  void main(String[] args) {
		// TODO Auto-generated method stub
		Ac ac=new Ac();
		ac.Brand="samsung";
		ac.color="white";
		ac.modelname="Ar18sfhkhksfskhzfs";
		ac.coolingcapacity=5000;
		ac.type="wireless";
		ac.price=40000;
		ac.weight=37;
		ac.printInfo();

	}
}

