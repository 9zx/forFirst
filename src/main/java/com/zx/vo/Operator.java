package com.zx.vo;

public class Operator {
	private Integer id;
	private Integer operator_Id;
	private String operator_Name;
	private String operator_Pwd;
	private Integer is_Admin;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getOperator_id() {
		return operator_Id;
	}
	public void setOperator_id(Integer operator_id) {
		this.operator_Id = operator_id;
	}
	public String getOperator_name() {
		return operator_Name;
	}
	public void setOperator_name(String operator_name) {
		this.operator_Name = operator_name;
	}
	public String getOperator_pwd() {
		return operator_Pwd;
	}
	public void setOperator_pwd(String operator_pwd) {
		this.operator_Pwd = operator_pwd;
	}
	public Integer getIs_admin() {
		return is_Admin;
	}
	public void setIs_admin(Integer is_admin) {
		this.is_Admin = is_admin;
	}

	
}
