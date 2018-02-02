package com.zx.Dao;

import com.zx.vo.Operator;

public interface OperatorDao {
	
	public Operator getOperator(Integer operator_id,String operator_pwd);
}
