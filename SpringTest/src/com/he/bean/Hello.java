package com.he.bean;

import org.springframework.stereotype.Component;
@Component
public class Hello {
	private String name;
	
	public Hello() {
		// TODO Auto-generated constructor stub
	}
	public Hello(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}

}
