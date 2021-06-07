package com.rk.service;

import com.rk.customexceptions.AgeCheckedException;
import com.rk.customexceptions.DuplicateNameException;
import com.rk.database.EmployeeDetails;
import com.rk.pojo.Employee;

public class EmployeeManageImpl implements EmployeeManage {
	
	static EmployeeDetails employee = new EmployeeDetails();
	@Override
	public void addEmployee(String name,int age)throws AgeCheckedException, DuplicateNameException {
		for(String s :employee.getEd().keySet()) {
			if(name.equals(s))
				throw new DuplicateNameException("Name " + name + " is already present in the database");
			if(age<18)
				throw new AgeCheckedException("Age cannot be less than 18 years old!");
			else if(age>60)
				throw new AgeCheckedException("Age cannot be more than 60 years old!");
		}
		EmployeeManageImpl.employee.getEd().put(name,new Employee(name,age));
	}

	@Override
	public void displayAllEmployees() {
		for(String s : employee.getNames()) {
			System.out.println(employee.getEd().get(s));
		}
	}

}