package BusBooking;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner m = new Scanner(System.in);
		System.out.println("Enter Passenger Name : ");
		String passengerName = m.next();
		System.out.println("Enter Email ID : ");
		String email = m.next();
		System.out.println("Enter Mobile Number : ");
		int mobile = m.nextInt();
		System.out.println("Enter Date Of Travel : ");
		String dateOfTravel = m.next();
		System.out.println("Enter the number of passenger : ");
		int npass = m.nextInt();
		System.out.println("Enter the price : ");
		int price = m.nextInt();
		System.out.println("Is Sleeper : ");
		boolean sleeper = m.nextBoolean();
		System.out.println("Is AC : ");
		boolean ac = m.nextBoolean();
		System.out.println("Is Wifi :");
		boolean wifi = m.nextBoolean();
		System.out.println("Enter the number of children : ");
		int nchild = m.nextInt();
		
		TicketBooking tb = new TicketBooking(npass,price,sleeper,ac,wifi,nchild);
		tb.bookTicket(npass, price);
		tb.bookTicket(npass, price, sleeper, ac);
		tb.bookTicket(npass, price, sleeper, ac, wifi);
		
	}

}
