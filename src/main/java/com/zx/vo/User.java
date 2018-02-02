package com.zx.vo;

public class User {

	private Integer user_id;
	private String mobile_Number;
	private String roaming_Status;
	private String com_Level;
	private Integer customer_Id;
	private String is_Available;


	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getMobile_Number() {
		return mobile_Number;
	}
	public void setMobile_Number(String mobile_Number) {
		this.mobile_Number = mobile_Number;
	}
	public String getRoaming_Status() {
		return roaming_Status;
	}
	public void setRoaming_Status(String roaming_Status) {
		this.roaming_Status = roaming_Status;
	}
	public String getCom_Level() {
		return com_Level;
	}
	public void setCom_Level(String com_Level) {
		this.com_Level = com_Level;
	}
	public Integer getCustomer_Id() {
		return customer_Id;
	}
	public void setCustomer_Id(Integer customer_Id) {
		this.customer_Id = customer_Id;
	}
	public String getIs_Available() {
		return is_Available;
	}
	public void setIs_Available(String is_Available) {
		this.is_Available = is_Available;
	}
	
}
