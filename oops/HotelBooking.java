package com.xworkz.oops;

public class HotelBooking {
	
	public String checkAvailability(String hotelName) {
		
		String listOfHotels[]= {"taj","bala","fore seson","nakshatra","harsha"};
		for (int i = 0; i < listOfHotels.length; i++) {
			if(listOfHotels[i].equalsIgnoreCase(hotelName)) {
				return listOfHotels[i];
			
		}
		}
		
		
		return null;
	}
	public  void Bookroom(int noOfRooms,int noOfDays,String hotelname) {
		int amt=0;
		int totalamt=0;
		
		switch(hotelname) {
		case "taj":
			amt=1000*noOfRooms;
			totalamt=amt*noOfDays;
			System.out.println("total amt= " +totalamt);
		}
	}

}


