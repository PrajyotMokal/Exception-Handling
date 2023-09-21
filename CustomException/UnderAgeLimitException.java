package com.jsp.CustomException;

public class UnderAgeLimitException 
	extends RuntimeException //unchecked exception
	{
	@Override
	public String getMessage() {
	
	
	return "Age cannot be below 20";
	}
}
