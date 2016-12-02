package com.he.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan
public class TestWork {
	
	@Autowired
	private Hello hello;
	
	@Autowired
	private Sb sb;
	
	@Autowired
	private All all;

	public void test(){
		all.printInfo();
	}
}
