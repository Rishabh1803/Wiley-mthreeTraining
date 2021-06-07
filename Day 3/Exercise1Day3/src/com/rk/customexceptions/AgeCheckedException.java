package com.rk.customexceptions;

@SuppressWarnings("serial")
public class AgeCheckedException extends Exception {
	
	public AgeCheckedException (String message) {
		if(message!=null)
			System.out.println(message);
		else
		{
			System.out.println("Age not valid");
		}
	}
}