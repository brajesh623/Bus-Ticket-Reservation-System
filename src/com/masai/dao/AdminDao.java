package com.masai.dao;

import java.util.List;

import com.masai.bean.Admin;
import com.masai.bean.Bus;
import com.masai.exception.AdminException;
import com.masai.exception.BusException;

public interface AdminDao {
	public Admin loginAdmin(String username,String password)throws AdminException;
	public List<Bus> getBusData()throws BusException;
}
