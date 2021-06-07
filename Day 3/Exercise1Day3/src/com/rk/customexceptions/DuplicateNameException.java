package com.rk.customexceptions;

@SuppressWarnings("serial")
public class DuplicateNameException extends RuntimeException {
	
	public DuplicateNameException(String message) {
		if(message!=null)
			System.out.println(message);
		else
			System.out.println("Name already in database");
	}
}
