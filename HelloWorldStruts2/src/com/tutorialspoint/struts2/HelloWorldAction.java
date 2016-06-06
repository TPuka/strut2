package com.tutorialspoint.struts2;

import java.util.HashMap;
import java.util.Map;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class HelloWorldAction extends ActionSupport
{
	
	
	
	private String name;
	public static String GOOD = SUCCESS;
	public static String BAD = ERROR;
	public static String VIEW = LOGIN;
	

	public String execute() throws Exception {
		
		ValueStack stack = ActionContext.getContext().getValueStack();
		Map<String, Object> context = new HashMap<String, Object>();
		context.put("key1", new String("This is key1"));
		context.put("key2", new String("This is key2"));
		stack.push(context);
		System.out.println("Size of the valueStack: " + stack.size());
		
		if ("puka".equals(name))
			return GOOD;
		else
			return BAD;
		
		
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
}