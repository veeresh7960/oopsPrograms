package com.xworkz.oops;

public class TicketBooking {
	public String checkRoot(String place) {
		String state[] = { "Karnataka", "Kerala", "Andrapradesh", "Maharastra", "Gujarath", "Koppal", "Bengalore",
				"Mysore", "Haveri", "Dk" };
		for (int i = 0; i < state.length; i++) {
			if (state[i].equalsIgnoreCase(place)) {
				return state[i];

			}
		}
		return null;
	}

	public void BussticketRoot(int noSeats, String place, String travelAgency) {
		int amt = 0;
		switch (travelAgency) {
		case "srs":
			if (place.equals("Karnataka")) {
				amt = noSeats * 700;
				System.out.println(amt);
			}
			if (place.equals("Kerala")) {
				amt = noSeats * 900;
				System.out.println(amt);
			}
			if (place.equals("Maharastra")) {
				amt = noSeats *1000 ;
				System.out.println(amt);
			}
		
		}

	}
}
