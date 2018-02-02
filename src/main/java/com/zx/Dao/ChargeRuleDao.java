package com.zx.Dao;

public interface ChargeRuleDao {
	
	public void deleteOldRule();
	
	public void saveNewRule(String[] charge_Code);
	
	public void updateChargeRule(String[] charge_Code);
}
