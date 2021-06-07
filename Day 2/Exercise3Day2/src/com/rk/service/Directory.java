package com.rk.service;

import java.util.TreeMap;

public class Directory {
	
	TreeMap<String, Record> telephone;
	
	public TreeMap<String, Record> getTelephone() {
		return telephone;
	}

	public void setTelephone(TreeMap<String, Record> telephone) {
		this.telephone = telephone;
	}

	public void addDetail(Record user) {
		telephone.put(user.getName(), user);
	}
	public void displayRecord(String name) {
		System.out.println(telephone.get(name));
	}
	public Directory() {
		telephone = new TreeMap<String, Record>();
	}
	public Directory(TreeMap<String, Record> telephone) {
		super();
		this.telephone = telephone;
	}
}
