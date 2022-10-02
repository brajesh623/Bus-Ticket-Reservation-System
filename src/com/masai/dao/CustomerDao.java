package com.masai.dao;

import com.masai.bean.Booking;
import com.masai.bean.Customer;
import com.masai.exception.BookingException;
import com.masai.exception.CustomerExeption;

public interface CustomerDao {
	public String registerCustomer(Customer customer);
	public Customer loginCustomer(String username,String password)throws CustomerExeption;
	public Booking bookTicket(String source,String destination) throws BookingException;
	public Boolean cancelTicket(int bookingId) throws BookingException;
	
}
