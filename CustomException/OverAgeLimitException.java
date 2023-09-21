package com.jsp.CustomException;

public class OverAgeLimitException 
extends Exception //checked exception
{
	@Override
	public String getMessage() {
		return "Age limit exceeded";
	}
}
