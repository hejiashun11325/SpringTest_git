package com.he.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
//		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
//		Hello bean = (Hello) ac.getBean("hello");
//		bean.out();
		
//		Sb sb=(Sb) ac.getBean("sb");
//		System.out.println("sex:"+sb.getSex()+";age:"+sb.getAge());
		
//		All all1 = (All) ac.getBean("all");
//		all1.printInfo();
		
//		All all2=(All) ac.getBean("all2");
//		all2.printInfo();
//		TestWork testwork = (TestWork) ac.getBean("testwork");
//		testwork.test();
		TestWork tWork=new TestWork();
		tWork.test();
	}
}
