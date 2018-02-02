package com.zx.Dao;

import javax.xml.bind.annotation.XmlTransient;

import com.oracle.jdbc.util.Dao;
import com.oracle.jdbc.util.ServiceFactory;
import com.oracle.jdbc.util.Transactional;

public class ChargeRuleDaoImpl implements ChargeRuleDao {

	public void deleteOldRule() {
		Dao.executeSql("delete from tcharge_rule");
		System.out.println("ɾ����ִ��");
	}

	public void saveNewRule(String[] rulecharge_Code) {
		if(rulecharge_Code!=null){
			for(int i=0;i<rulecharge_Code.length;i++){
				Dao.executeSql("insert into tcharge_rule values(null,'O',?,'����')",rulecharge_Code[i]);
			}
		}
	}
	@Transactional
	public void updateChargeRule(String[] charge_Code) {

		ChargeRuleDao dao=ServiceFactory.getObject(ChargeRuleDaoImpl.class);
		Dao.executeSql("delete from tcharge_rule");
		System.out.println("ɾ����ִ��");
		if(charge_Code!=null){
			for(int i=0;i<charge_Code.length;i++){
				Dao.executeSql("insert into tcharge_rule values(null,'O',?,'����')",charge_Code[i]);
			}
		}
	}
}
