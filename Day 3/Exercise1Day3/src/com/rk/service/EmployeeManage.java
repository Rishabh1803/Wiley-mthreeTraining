package com.rk.service;

import com.rk.customexceptions.AgeCheckedException;
import com.rk.customexceptions.DuplicateNameException;

public interface EmployeeManage {
	void addEmployee(String name, int age) throws AgeCheckedException, DuplicateNameException;
	void displayAllEmployees();
}