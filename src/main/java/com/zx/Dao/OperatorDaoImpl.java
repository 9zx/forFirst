package com.zx.Dao;

import com.oracle.jdbc.util.Dao;
import com.zx.vo.Operator;

public class OperatorDaoImpl implements OperatorDao {

	
	public Operator getOperator(Integer operator_id, String operator_pwd) {
		return Dao.queryOne("select * from toperator where operator_id=? and operator_pwd=md5(?) ", Operator.class, operator_id,operator_pwd);
	}

}
