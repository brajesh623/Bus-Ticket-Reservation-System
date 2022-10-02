package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Booking;
import com.masai.dao.AdminDao;
import com.masai.dao.AdminImpl;
import com.masai.exception.BookingException;

public class GetSeatConfirmation {

	public static void get() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Booking Id :");
		int id=sc.nextInt();
				
		
		
		AdminDao admin = new AdminImpl();
		Booking b=new Booking();
		
		try {
		 b= admin.getSeatConfirmation(id);
		System.out.println("============================================");	
		System.out.println("Booking Id  : "+b.getBkid());
		System.out.println("Customer Id : "+b.getCid());
		System.out.println("Bus Id      : "+b.getBid());
		

		}catch(BookingException se) {
			System.out.println(se.getMessage());
		}
	}

}
