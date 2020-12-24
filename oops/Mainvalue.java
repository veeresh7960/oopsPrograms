package com.xworkz.oops;

public class Mainvalue {

	public static void main(String[] args) {
		TicketBooking ticketBooking = new TicketBooking();
		String checkRoot = ticketBooking.checkRoot("Karnataka");
		System.out.println(checkRoot);
		if (checkRoot != null) {
			System.out.println("root is avilable");
			String place="Kerala";
			ticketBooking.BussticketRoot(2, place, "srs");
		} else {

			System.out.println("sry not avilable for this root ");

		}
		
	}

}
