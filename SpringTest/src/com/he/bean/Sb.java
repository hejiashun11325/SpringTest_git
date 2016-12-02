package com.he.bean;

import org.springframework.stereotype.Component;

@Component
public class Sb {
	private String sex;
	private int age;
	 public Sb() {
		// TODO Auto-generated constructor stub
	}
	public Sb(String sex,int age) {
		this.sex=sex;
		this.age=age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
