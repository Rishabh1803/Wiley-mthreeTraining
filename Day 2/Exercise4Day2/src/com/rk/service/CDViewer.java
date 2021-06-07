package com.rk.service;

import java.util.TreeMap;

public class CDViewer {
	private TreeMap<String, CD> cd;

	public TreeMap<String, CD> getCd() {
		return cd;
	}

	public void setCd(TreeMap<String, CD> cd) {
		this.cd = cd;
	}

	public CDViewer(TreeMap<String, CD> cd) {
		super();
		this.cd = cd;
	}
	public CDViewer() {
		cd = new TreeMap<String, CD>();
	}
	public void addCD(CD cd) {
		this.cd.put(cd.getTitle(), cd);
	}
	public void displayCD(String title) {
		System.out.println(cd.get(title));
	}
}