package com.zx.Dao;

import com.oracle.jdbc.util.Dao;

public class ChargeDaoImpl implements ChargeDao {

	
	
	public void updateChargeOne(String charge_Code,float charge) {
		System.out.println("¸üÐÂ");
		Dao.executeSql("update tcharge set charge=? where charge_Code=?",charge,charge_Code);
		
	}

}
