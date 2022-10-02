package com.masai.utility;

import java.util.Scanner;

import com.masai.usecases.AdminLogin;
import com.masai.usecases.BookTicket;
import com.masai.usecases.CancelTicket;
import com.masai.usecases.CustomerLogin;
import com.masai.usecases.CustomerRegistration;
import com.masai.usecases.GetBusData;
import com.masai.usecases.GetContactPerson;
import com.masai.usecases.GetSeatConfirmation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Boolean y=true;
		while(y) {
			System.out.println("Welcome To Bus Ticket Reservation System.");
			System.out.println("============================================================");
			System.out.println("Select Any option :\n1. Admin Login\n2. Customer Registration\n3. Customer Login\n4. Exit\nEnter your choice :");
			int ch=sc.nextInt();
			switch(ch) {
				case 1:
					Boolean status=AdminLogin.login();
					if(status) {
						Boolean x=true;
						while(x) {
							System.out.println("==================================================");
							System.out.println("Select any option :\n1. Get all Buses\n2. Get seat confirmation\n3. Get contact Person\n4. Back to previous options\n5. Exit\nEnter your choice :");
							int ach=sc.nextInt();
							switch(ach) {
								case 1:
									GetBusData.get();
									break;
								case 2:
									GetSeatConfirmation.get();
									break;
								case 3:
									GetContactPerson.get();
									break;
								case 4:
									System.out.println("Thank You!");
									x=false;
									break;
								case 5:
									System.out.println("Thank You!");
									x=false;
									y=false;
									break;
								default :
									System.out.println("Enter a valid choice.");
									break;
							}
						}
						
					}
					break;
				case 2:
					CustomerRegistration.register();
					break;
				case 3:
					Boolean status1=CustomerLogin.login();
					if(status1) {
						Boolean z=true;
						while(z) {
							System.out.println("=======================================================");
							System.out.println("Select any option :\n1. Book Ticket\n2. Cancel Ticket\n3. Back to previous options\n4. Exit\nEnter your choice :");
							int cch=sc.nextInt();
							switch(cch) {
								case 1:
									BookTicket.book();
									break;
								case 2:
									CancelTicket.cancel();
									break;
								case 3:
									System.out.println("Thank You!");
									z=false;
									break;
								case 4:
									System.out.println("Thank You!");
									z=false;
									y=false;
									break;
								default :
									System.out.println("Enter a valid choice.");
									break;
							}
						}
					}
					break;
				case 4:
					System.out.println("Thank You!");
					y=false;
					break;
				default :
					System.out.println("Enter a valid choice.");
					
			}
		}
		
	}

}
