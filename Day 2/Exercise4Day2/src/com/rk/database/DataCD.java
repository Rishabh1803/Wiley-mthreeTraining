package com.rk.database;

import java.util.ArrayList;
import java.util.List;

import com.rk.service.CD;

public class DataCD {
	private List<CD> list;

	public DataCD(List<CD> list) {
		super();
		this.list = list;
	}

	public List<CD> getList() {
		return list;
	}

	public void setList(List<CD> list) {
		this.list = list;
	}
	public DataCD() {
		list = new ArrayList<CD>();
	}
	public void addCD() {
		list.add(new CD("Meteora", "Linkin Park"));
		list.add(new CD("Hybrid Theory", "Linkin Park"));
		list.add(new CD("Minutes to Midnight", "Linkin Park"));
		list.add(new CD("Reanimation", "Linkin Park"));
		list.add(new CD("One More Light", "Linkin Park"));
		list.add(new CD("A Thousand Suns", "Linkin Park"));
		list.add(new CD("Meteora", "Linkin Park"));
		list.add(new CD("Divide", "Ed Sheeran"));
		list.add(new CD("Thriller", "Michael Jackson"));
		list.add(new CD("Smooth Criminal", "Michael Jackson"));
		list.add(new CD("Bad", "Michael Jackson"));
	}
}
