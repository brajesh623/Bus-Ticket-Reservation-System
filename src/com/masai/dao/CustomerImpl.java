package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.masai.bean.Admin;
import com.masai.bean.Booking;
import com.masai.bean.Customer;
import com.masai.exception.AdminException;
import com.masai.exception.BookingException;
import com.masai.exception.CustomerExeption;
import com.masai.utility.DBUtil;

public class CustomerImpl implements CustomerDao{
	static int cid=0;
	
	@Override
	public String registerCustomer(Customer customer) {
		// TODO Auto-generated method stub
		String message = "Not Inserted..";
	
		
	
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement
					("insert into customer(email,password) values(?,?)");
			
			
			
			ps.setString(1, customer.getEmail());
			ps.setString(2, customer.getPassword());
			
			int x= ps.executeUpdate();
			
			
			if(x > 0)
				
				message= "‖      Customer Registered Sucessfully !    ‖";
			
			
			
		} catch (SQLException e) {
			message = e.getMessage();
		}
		
		
	
	
		
		return message;
	}
	@Override
	public Customer loginCustomer(String username, String password) throws CustomerExeption {
		// TODO Auto-generated method stub
		Customer customer=null;
		try(Connection conn = DBUtil.provideConnection()) {
			
			
			PreparedStatement ps= conn.prepareStatement("select * from customer where email = ? AND password = ?");			
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs= ps.executeQuery();
			
			
			if(rs.next()) {
				int id= rs.getInt("cid");
				String e= rs.getString("Email");
				String p= rs.getString("password");
				this.cid=id;
			customer=new Customer(id,e,p);	
				
				
			}else
				throw new CustomerExeption("Invalid Username or password.. ");
			
			
		} catch (SQLException e) {
			throw new CustomerExeption(e.getMessage());
		}
		
		
		
		return customer;
	}

	@Override
	public Booking bookTicket(String source, String destination) throws BookingException {
		// TODO Auto-generated method stub
		Booking booking=null;
		int blid=0;
		int bid=0;
		try (Connection conn = DBUtil.provideConnection()){
			PreparedStatement ps= conn.prepareStatement("select * from bus_link where source=? and dest=?");
			ps.setString(1, source);
			ps.setString(2,destination);
			ResultSet rs=ps.executeQuery();
			if(rs==null) {
				throw new BookingException("No Bus avilble between provided source and destination.. ");
			}
			Boolean flag=false;
			while(rs.next()) {
				if(rs.getInt("seat")>0) {
					blid=rs.getInt("blid");
					flag=true;
				}
				
			}
			if(!flag) {
				throw new BookingException("No seat available.. ");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			throw new BookingException(e.getMessage());
		}
		
		try (Connection conn = DBUtil.provideConnection()){
			PreparedStatement ps= conn.prepareStatement("update bus_link set seat=seat-1 where blid=?");
			ps.setInt(1, blid);
			int x=ps.executeUpdate();
			
			PreparedStatement ps1= conn.prepareStatement("select b.bid,bl.blid from bus b,bus_link bl where b.blid=bl.blid and bl.blid=? ");
			ps1.setInt(1, blid);
			ResultSet rs=ps1.executeQuery();
			if(rs.next()) {
				bid=rs.getInt("bid");
			}
			PreparedStatement ps3= conn.prepareStatement("insert into booking(bid,cid) values(?,?)");
			ps3.setInt(1, bid);
			ps3.setInt(2, cid);
			int x1=ps3.executeUpdate();
			if(x1>0) {
				PreparedStatement ps4= conn.prepareStatement("select bkid from booking order by bkid desc limit 1");
				ResultSet rs1=ps4.executeQuery();
				booking=new Booking();
				if(rs1.next()) {
					booking.setBkid(rs1.getInt("bkid"));
				}
				
				booking.setBid(bid);
				booking.setCid(cid);
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			throw new BookingException(e.getMessage());
		}
		
		
		
		return booking;
	}

	@Override
	public Boolean cancelTicket(int bookingId) throws BookingException {
		// TODO Auto-generated method stub
		Boolean flag=false;
		try (Connection conn = DBUtil.provideConnection()){
			PreparedStatement ps= conn.prepareStatement("delete from booking where bkid=?");
			ps.setInt(1, bookingId);
			
			int x=ps.executeUpdate();
			if(x>0) {
				flag=true;
			}else {
				throw new BookingException("Incorrect Booking id.. ");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			throw new BookingException(e.getMessage());
		}
		
		return flag;
	}

}
