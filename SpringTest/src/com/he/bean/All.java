package com.he.bean;

import org.springframework.stereotype.Component;

@Component
public class All {
	private Hello hello;
	private Sb sb;
	
	public All() {
		// TODO Auto-generated constructor stub
	}
	public All(Hello hello, Sb sb) {
		super();
		this.hello = hello;
		this.sb = sb;
	}
	public void printInfo(){
		System.out.println(hello.getName());
		System.out.println(sb.getAge()+";;;;"+sb.getSex());
	}
}
