package com.springcore.stereotype;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	private List<String> address;

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address [address=" + address + "]";
	}
	
	


}
