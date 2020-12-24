package com.xworkz.oops;

public class Flights {

	public static void main(String[] args) {
		SpiceJet spiceJet = new SpiceJet();
		String flights[]=spiceJet.addflights("spice235");
		flights=spiceJet.addflights("spicejet236");
		flights=spiceJet.addflights("spicejet237");
		flights=spiceJet.addflights("spicejet238");	
		spiceJet.display(flights);
	
	
	}

}
