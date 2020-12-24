package com.xworkz.computer;

public class Computer {
	private String brand;
	private int systemId;
	private String os;

	public void disply() {
		System.out.println(" invoked display");
		System.out.println(this.brand);
		System.out.println(this.os);
		System.out.println(this.systemId);
	}

	public void switchOn() {
		System.out.println(" invoked switchon ");

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSystemId() {
		return systemId;
	}

	public void setSystemId(int systemId) {
		this.systemId = systemId;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

}
