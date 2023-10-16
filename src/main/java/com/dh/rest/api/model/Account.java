package com.dh.rest.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

@Component
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "account")
public class Account {
	
	@XmlElement
	private int accno;
	
	@XmlElement
	private String name;
	
	@XmlElement
	private String branch;
	
	@XmlElement
	private int amount;

	//default constructor
	public Account() {
		super();
	}

	//parameterized constructor
	public Account(int accno, String name, String branch, int amount) {
		super();
		this.accno = accno;
		this.name = name;
		this.branch = branch;
		this.amount = amount;
	}

	//getters and setters
	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	//to string
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", name=" + name + ", branch=" + branch + ", amount=" + amount + "]";
	}
}