package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import com.masai.bean.Admin;
import com.masai.bean.Booking;
import com.masai.bean.Bus;
import com.masai.bean.ContactPerson;
import com.masai.exception.AdminException;
import com.masai.exception.BookingException;
import com.masai.exception.BusException;
import com.masai.exception.ContactPersonException;
import com.masai.utility.DBUtil;

public class AdminImpl implements AdminDao{

	@Override
	public Admin loginAdmin(String username, String password) throws AdminException {
		// TODO Auto-generated method stub
		Admin admin=null;
		try(Connection conn = DBUtil.provideConnection()) {
			
			
			PreparedStatement ps= conn.prepareStatement("select * from admin where email = ? AND password = ?");			
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs= ps.executeQuery();
			
			
				if(rs.next()) {
				
				int id= rs.getInt("userid");
				String e= rs.getString("Email");
				String p= rs.getString("password");
				
				
			admin=new Admin(id,e,p);	
				
				
			}else
				throw new AdminException("Invalid Username or password.. ");
			
			
		} catch (SQLException e) {
			throw new AdminException(e.getMessage());
		}
		
		return admin;
	}

	@Override
	public List<Bus> getBusData() throws BusException {
		// TODO Auto-generated method stub
		List<Bus> bl=new ArrayList<>();
		try (Connection conn = DBUtil.provideConnection()){
			PreparedStatement ps= conn.prepareStatement("select b.bid,b.name,b.type,bl.source,bl.dest,bl.dept,bl.arrival,bl.seat from bus b,bus_link bl where b.blid=bl.blid");
			ResultSet rs=ps.executeQuery();
			if(rs==null) {
				throw new BusException("No bus Found...");
			}
			while(rs.next()) {
				int bid=rs.getInt("bid");
				String name=rs.getString("name");
				String type=rs.getString("type");
				String source=rs.getString("source");
				String dest=rs.getString("dest");
				Time arrival=rs.getTime("arrival");
				Time dept=rs.getTime("dept");
				int seat=rs.getInt("seat");
				
				Bus b=new Bus(bid,name,type,source,dest,arrival,dept,seat);
				bl.add(b);
				
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			throw new BusException(e.getMessage());
		}
		
		
		
		return bl;
	}

	@Override
	public Booking getSeatConfirmation(int bookingid) throws BookingException {
		// TODO Auto-generated method stub
		Booking booking=null;
		try (Connection conn = DBUtil.provideConnection()){
			PreparedStatement ps= conn.prepareStatement("select * from booking where bkid=?");
			ps.setInt(1, bookingid);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				int bkid=rs.getInt("bkid");
				int cid=rs.getInt("cid");
				int bid=rs.getInt("bid");
				booking=new Booking(bkid,cid,bid);
				
			}else {
				throw new BookingException("No booking Found...");
			}
			
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			throw new BookingException(e.getMessage());
		}
		
		
		
		return booking;
	}

	@Override
	public ContactPerson getContactPerson(int busid) throws ContactPersonException {
		// TODO Auto-generated method stub
		ContactPerson cp=null;
		try (Connection conn = DBUtil.provideConnection()){
			PreparedStatement ps= conn.prepareStatement("select cp.cpid,cp.name,cp.mobile,b.bid from contact_person cp,bus b where cp.cpid=b.cpid and b.bid=?");
			ps.setInt(1, busid);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				int cpid=rs.getInt("cpid");
				String name=rs.getString("name");
				String mobile=rs.getString("mobile");
				
				cp=new ContactPerson(cpid,name,mobile);
			}else {
				throw new ContactPersonException("No contact person Found...");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			throw new ContactPersonException(e.getMessage());
		}
		
		
		
		return cp;
	}

}
