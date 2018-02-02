package com.zx.vo;

import java.sql.Date;

public class Customer {
	
	private Integer customer_Id;
	private String id_Type;
	private String id_Number;
	private String customer_Name;
	private Date customer_BirtyDay;
	private String customer_Sex;
	private String customer_Add;
	public Integer getCustomer_Id() {
		return customer_Id;
	}
	public void setCustomer_Id(Integer customer_Id) {
		this.customer_Id = customer_Id;
	}
	public String getId_Type() {
		return id_Type;
	}
	public void setId_Type(String id_Type) {
		this.id_Type = id_Type;
	}
	public String getId_Number() {
		return id_Number;
	}
	public void setId_Number(String id_Number) {
		this.id_Number = id_Number;
	}
	public String getCustomer_Name() {
		return customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}
	public Date getCustomer_BirtyDay() {
		return customer_BirtyDay;
	}
	public void setCustomer_BirtyDay(Date customer_BrityDay) {
		this.customer_BirtyDay = customer_BrityDay;
	}
	public String getCustomer_Sex() {
		return customer_Sex;
	}
	public void setCustomer_Sex(String customer_Sex) {
		this.customer_Sex = customer_Sex;
	}
	public String getCustomer_Add() {
		return customer_Add;
	}
	public void setCustomer_Add(String customer_Add) {
		this.customer_Add = customer_Add;
	}
	
	
}
