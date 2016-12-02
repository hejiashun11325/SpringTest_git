package com.he.bean;



import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/helloworld")
public class HelloWorld {

	private String path="hello";
	
	@RequestMapping(params="method=init")
	public String init(HttpServletRequest request,HttpServletResponse response)throws Exception{
		
		return path;
		
	}
	@RequestMapping(params="method=getresult")
	public void helloworld(HttpServletRequest request,HttpServletResponse response)throws Exception{
		
		PrintWriter writer = response.getWriter();
		
		writer.println("hello world");
	}
}
