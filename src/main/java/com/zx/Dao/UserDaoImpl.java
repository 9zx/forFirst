package com.zx.Dao;

import com.oracle.jdbc.util.Dao;

public class UserDaoImpl implements UserDao {

	public void insertUser(String mobile_Number, String roaming_Status, String com_Level, Integer customer_Id){
		
		
		Dao.executeSql("insert into tuser values(null,?,?,?,?,'Y')",mobile_Number,roaming_Status,com_Level,customer_Id);

	}

}
