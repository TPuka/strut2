package com.tutorialspoint.struts2;

import java.util.*;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;



public class MyInterceptor extends AbstractInterceptor {

	public String intercept(ActionInvocation invocation) throws Exception
	{
		String output = "Pre-processing";
		System.out.println(output);
		
		String result = invocation.invoke();
		
		output = "Post-processing";
		System.out.println(output);
		
		return result;
	}
}
