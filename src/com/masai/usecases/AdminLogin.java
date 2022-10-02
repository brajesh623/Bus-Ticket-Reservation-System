package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Admin;
import com.masai.dao.AdminDao;
import com.masai.dao.AdminImpl;
import com.masai.exception.AdminException;

public class AdminLogin {

	public static Boolean login() {
		Boolean status=false;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Username:");
		String uname = sc.next();
		
		System.out.println("Enter Password:");
		String pass = sc.next();
		
		AdminDao dao = new AdminImpl();
		
		try {
			Admin admin= dao.loginAdmin(uname, pass);
			status=true;
			System.out.println("============================================");
	 		System.out.println("‖               Welcome Admin               ‖");
	 		
	 	
		}catch (AdminException e) {
			System.out.println(e.getMessage());
		}
		return status;
	}
}
