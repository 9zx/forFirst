package com.zx.service;

import com.oracle.jdbc.util.ServiceFactory;
import com.oracle.jdbc.util.Transactional;
import com.zx.Dao.ChargeRuleDao;
import com.zx.Dao.ChargeRuleDaoImpl;

public class ChargeRuleServiceImpl implements ChargeRuleService {

	
	public void updateChargeRule(String[] charge_Code) {
		ChargeRuleDao dao=ServiceFactory.getObject(ChargeRuleDaoImpl.class);
		dao.deleteOldRule();
		dao.saveNewRule(charge_Code);		
	}

}
