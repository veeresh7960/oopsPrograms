package com.xworkz.oops;

public class BookingRoom {

	public static void main(String[] args) {
		HotelBooking hotelBooking = new HotelBooking();
		String checkAvailability = hotelBooking.checkAvailability("balaji");
		System.out.println(checkAvailability);
		if (checkAvailability != null) {
			System.out.println("hotel is avilable");
			hotelBooking.Bookroom(2, 3, "balaji");
		} else {

			System.out.println("invalid ");

		}
	}

}
