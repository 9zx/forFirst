package com.zx.Dao;

import java.util.List;

import com.oracle.jdbc.util.Dao;
import com.oracle.jdbc.util.Transactional;

public class MobileDaoImpl implements MobileDao {
	
	
	public void saveMobile(String start_mobile, String end_mobile,String mobile_Type) {
		for(Long number=Long.valueOf(start_mobile);number<=Long.valueOf(end_mobile);number++){
			Dao.executeSql("insert into tmobiles values(null,?,?,?,?) ",number.toString(),mobile_Type,number+1,"Y");
		}
		
	
	}

	public List<Object[]> getMobileNumberByLike(String number) {
		return Dao.query("select mobile_Number from tmobiles where is_Available='Y' and mobile_Number like ? limit 0,10", "%"+number+"%");
		
	}

}
