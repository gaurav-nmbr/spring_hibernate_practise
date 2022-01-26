package com.springcore.nmbr;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity(name="student")  for changing name
@Entity
@Table(name="students")
public class Base {
	
	@Id
	private int id;
	private String name;
	private String city;
	
	private Certificate certi;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Base(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	
	public Base(int id, String name, String city, Certificate certi) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.certi = certi;
	}
	public Certificate getCerti() {
		return certi;
	}
	public void setCerti(Certificate certi) {
		this.certi = certi;
	}
	public Base() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Base [id=" + id + ", name=" + name + ", city=" + city + ", certi=" + certi + "]";
	}
	
	

}
