package com.rk.database;

import java.util.ArrayList;
import java.util.List;

import com.rk.service.Record;

public class Data {
	private List<Record> list;

	public List<Record> getList() {
		return list;
	}

	public void setList(List<Record> list) {
		this.list = list;
	}
	public void addData() {
		list = new ArrayList<Record>();
		list.add(new Record("Rishabh",7007L));
		list.add(new Record("Sarthak",6393L));
		list.add(new Record("Luv",6388L));
		list.add(new Record("Abhinav",8126L));
		list.add(new Record("Shivam",6388L));
		list.add(new Record("Utkarsh",9453L));
	}
}