package com.zx.Dao;

import java.sql.Date;

import com.zx.vo.Customer;

public interface CustomerDao {
	
	public Customer getCustomer(String id_Type,String id_Number);

	public void insertCustomer(String id_Type,String id_Number);
	
	public void updateCustomer(String customer_Name,Date customer_BirtyDay,String customer_Sex,String customer_Add);
}
