package com.org.rest.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column
	private String fname;
	@Column
	private String lname;
	@Column
	private String branch;
	
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}




	



	public Student(long id, String fname, String lname, String branch) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.branch = branch;
	}








	public long getId() {
		return id;
	}








	public void setId(long id) {
		this.id = id;
	}








	public String getFname() {
		return fname;
	}








	public void setFname(String fname) {
		this.fname = fname;
	}








	public String getLname() {
		return lname;
	}








	public void setLname(String lname) {
		this.lname = lname;
	}








	public String getBranch() {
		return branch;
	}








	public void setBranch(String branch) {
		this.branch = branch;
	}








	
	
	
	
	
	
}
