package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Booking;
import com.masai.dao.CustomerDao;
import com.masai.dao.CustomerImpl;
import com.masai.exception.BookingException;

public class BookTicket {

	public static void book() {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Source :");
		String source=sc.nextLine();
		System.out.println("Enter Destination :");
		String dest=sc.nextLine();
		
		CustomerDao dao=new CustomerImpl();
		Booking b=new Booking();
		try {
			 b= dao.bookTicket(source, dest);
			 System.out.println("============================================");
			 System.out.println("‖               Ticket Details              ‖");
			 System.out.println("============================================");
			 System.out.println("Booking Id  : "+b.getBkid());
			 System.out.println("Customer Id : "+b.getCid());
			 System.out.println("Bus Id      : "+b.getBid());
			

			}catch(BookingException se) {
				System.out.println(se.getMessage());
			}
		
	}

}
