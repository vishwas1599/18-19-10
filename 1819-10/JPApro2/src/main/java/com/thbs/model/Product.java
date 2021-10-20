package com.thbs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int pid;
	private String pname;
	private int qty;
	private int uprice;
	
	
	public Product() {
		super();
	}


	public Product(int pid, String pname, int qty, int uprice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.uprice = uprice;
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	public int getUprice() {
		return uprice;
	}


	public void setUprice(int uprice) {
		this.uprice = uprice;
	}
	
	
	
	
}
