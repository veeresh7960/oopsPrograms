package com.xworkz.oops;

public class Flight {
	String name;
	int price;
	String modelName;
	int engineSpeed;
	String typeOfPlane;

	Flight flightArray[] = new Flight[3];
	static int i = 0;

	public void addFlight(Flight flight) {

		flightArray[i] = flight;
		i = i + 1;

	}

	public int getPrice() {
		return price;
	}

	public String getModelName() {
		return modelName;
	}

	public int getEngineSpeed() {
		return engineSpeed;
	}

	public Flight(String name, int price, String modelName, int engineSpeed, String typeOfPlane) {
		super();
		this.name = name;
		this.price = price;
		this.modelName = modelName;
		this.engineSpeed = engineSpeed;
		this.typeOfPlane = typeOfPlane;
	}

	public void Fly() {
		System.out.println("flight is flying");
	}

	public void carryPeople() {
		System.out.println("people can travell in flight ");
	}

	public void trasportingOfGoods() {
		System.out.println("goods transported by plane");

	}

}
