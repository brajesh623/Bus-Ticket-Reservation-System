package com.masai.usecases;

import java.util.Scanner;
import com.masai.dao.CustomerDao;
import com.masai.dao.CustomerImpl;
import com.masai.exception.BookingException;

public class CancelTicket {

	public static void cancel() {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Booking Id:");
		int id=sc.nextInt();
		
		CustomerDao dao=new CustomerImpl();
		Boolean status=false;
		try {
			 status= dao.cancelTicket(id);
			 if(status) {
				 System.out.println("============================================");
				 System.out.println("‖              Ticket Cancelled.            ‖");
			 }
			
			

			}catch(BookingException se) {
				System.out.println(se.getMessage());
			}
	}

}
