package com.masai.usecases;

import java.util.Scanner;
import com.masai.bean.ContactPerson;
import com.masai.dao.AdminDao;
import com.masai.dao.AdminImpl;
import com.masai.exception.ContactPersonException;

public class GetContactPerson {

	public static void get() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Bus Id :");
		int id=sc.nextInt();
				
		
		
		AdminDao admin = new AdminImpl();
		ContactPerson c=new ContactPerson();
		
		try {
		 c= admin.getContactPerson(id);
		 System.out.println("============================================");	
		 System.out.println("Contact Person Id     :"+c.getCpid());
		 System.out.println("Contact Person name   : "+c.getName());
		 System.out.println("Contact Person mobile : "+c.getMobile());
		

		}catch(ContactPersonException se) {
			System.out.println(se.getMessage());
		}
	}

}
