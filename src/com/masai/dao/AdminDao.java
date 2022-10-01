package com.masai.dao;

import java.util.List;

import com.masai.bean.Admin;
import com.masai.bean.Booking;
import com.masai.bean.Bus;
import com.masai.bean.ContactPerson;
import com.masai.exception.AdminException;
import com.masai.exception.BookingException;
import com.masai.exception.BusException;
import com.masai.exception.ContactPersonException;

public interface AdminDao {
	public Admin loginAdmin(String username,String password)throws AdminException;
	public List<Bus> getBusData()throws BusException;
	public Booking getSeatConfirmation(int customerid) throws BookingException;
	public ContactPerson getContactPerson(int busid) throws ContactPersonException;
}
