package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Customer;
import com.masai.dao.CustomerDao;
import com.masai.dao.CustomerImpl;
import com.masai.exception.CustomerExeption;

public class CustomerLogin {

	public static Boolean login() {
		Boolean status=false;
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Username:");
		String uname = sc.next();
		
		System.out.println("Enter Password:");
		String pass = sc.next();
		
		CustomerDao dao = new CustomerImpl();
		
		try {
			Customer customer= dao.loginCustomer(uname, pass);
			status=true;
			System.out.println("============================================");
	 		System.out.println("‖              Welcome Customer             ‖");
	 	
	 	
		}catch (CustomerExeption e) {
			System.out.println(e.getMessage());
		}
		return status;
	}

}
