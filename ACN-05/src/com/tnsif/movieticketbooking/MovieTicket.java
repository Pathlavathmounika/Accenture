package com.tnsif.movieticketbooking;

class MovieTicket {
	int TicketId;
	String MovieName;
	int SeatsBooked;
	
	static int totalBookings = 0;
	MovieTicket(int TicketId, String MovieName, int SeatsBooked) {
        this.TicketId = TicketId;
        this.MovieName = MovieName;
        this.SeatsBooked = SeatsBooked;
        totalBookings++;
	}
	
	void displayDetails() {
		System.out.println("Ticket Id:"+ TicketId);
		System.out.println("Movie Name:"+ MovieName);
		System.out.println("Seats Booked:"+ SeatsBooked);
	}
	

	public static void main(String[] args) {
		
		MovieTicket t1 = new MovieTicket(101,"VeeraBhadrudu", 4);
		MovieTicket t2 = new MovieTicket(102,"Kalki",6);
		t1.displayDetails();
		t2.displayDetails();
		System.out.println("Total Bookings:"+ MovieTicket.totalBookings);
	}

}
