package com.he.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		Hello bean = (Hello) ac.getBean("hello");
		bean.out();
		ApplicationContext bc=new ClassPathXmlApplicationContext("applicationContext.xml");
		Sb sb=(Sb) bc.getBean("spring");
		System.out.println("sex:"+sb.getSex()+";age:"+sb.getAge());
	}
}
