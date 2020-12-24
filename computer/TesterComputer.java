package com.xworkz.computer;

import com.xworkz.Desktop;
import com.xworkz.Laptop;

public class TesterComputer {

	public static void main(String[] args) {
		Computer comp = new Computer();
		Computer computer = new Desktop();
		Computer lap = new Laptop();

		Desktop desktop = new Desktop();
		Computer comp1 = new Desktop();
		Desktop des = (Desktop) comp1;

		Computer desktop1 = new Desktop();
		desktop.setBrand("dell");
		desktop.setMemory(1);
		desktop.setOs("windows");
		desktop.setSystemId(128659);
		desktop.disply();
		desktop.switchOn();
		DellLaptop dellLaptop = new DellLaptop();
		dellLaptop.switchOff();
		dellLaptop.setConnectivity("Bluetooth");

	}

}
