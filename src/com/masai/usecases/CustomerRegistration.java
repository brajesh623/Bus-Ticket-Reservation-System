package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Customer;
import com.masai.dao.CustomerDao;
import com.masai.dao.CustomerImpl;

public class CustomerRegistration {

	public static void register() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Your Email:");
		String email= sc.next();
		
		System.out.println("Create Password :");
		String password= sc.next();
		
		
		CustomerDao dao=new CustomerImpl();
		
		
		
		Customer customer= new Customer();
		customer.setEmail(email);
		customer.setPassword(password);
		
		
		
		String result= dao.registerCustomer(customer);
		System.out.println("============================================");
		System.out.println(result);

	}

}
