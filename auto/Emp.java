package com.springcore.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	@Autowired //it searches bean by type (default)
	@Qualifier("add2")  //it searches bean by name
	private Address address;

	public Address getAddress() {
		System.out.println("getting values");
		return address;
	}
	
	public void setAddress(Address address) {
		System.out.println("setting values");
		this.address = address;
	}

	public Emp(Address address) {
		super();
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
}
