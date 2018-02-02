package com.zx.Dao;

import java.util.List;

public interface MobileDao {
	
	public void saveMobile(String start_mobile,String end_mobile,String mobile_Type);
	
	public List<Object[]> getMobileNumberByLike(String number);
}
