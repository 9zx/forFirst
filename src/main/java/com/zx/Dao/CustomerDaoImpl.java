package com.zx.Dao;

import java.sql.Date;

import com.oracle.jdbc.util.Dao;
import com.zx.vo.Customer;

public class CustomerDaoImpl implements CustomerDao {

	public Customer getCustomer(String id_Type, String id_Number) {
		return Dao.queryOne("select * from tcustomer where id_Type=? and id_Number=?", Customer.class, id_Type,id_Number);

	}

	public void insertCustomer(String id_Type, String id_Number) {
		Dao.executeSql("insert into tcustomer values(null,?,?,null,null,null,null)",id_Type,id_Number);
		
	}

	public void updateCustomer( String customer_Name, Date customer_BirtyDay,String customer_Sex, String customer_Add) {

		Dao.executeSql("update tcustomer set customer_Name=?,customer_BirtyDay=?,customer_Sex=?,customer_Add=?",customer_Name,customer_BirtyDay,customer_Sex,customer_Add);
	}

}
