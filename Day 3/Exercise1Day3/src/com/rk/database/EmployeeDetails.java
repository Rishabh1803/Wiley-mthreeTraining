package com.rk.database;

import java.util.Set;
import java.util.TreeMap;

import com.rk.pojo.Employee;

public class EmployeeDetails {
	
	private static TreeMap<String, Employee> employee = new TreeMap<String, Employee>();

	public TreeMap<String, Employee> getEd() {
		return employee;
	}

	public void setEd(TreeMap<String, Employee> ed) {
		employee = ed;
	}
	
	public Set<String> getNames() {
		return employee.keySet();
	}
	
	static {
		employee.put("Rishabh",new Employee("Rishabh", 23));
		employee.put("Sarthak",new Employee("Sarthak", 21));
		employee.put("Shivam",new Employee("Shivam", 23));
		employee.put("Abhinav",new Employee("Abhinav", 21));
		employee.put("Prashant",new Employee("Prashant", 23));
		employee.put("Utkarsh",new Employee("Utkarsh", 25));
		employee.put("Luv",new Employee("Luv", 23));
	}
}