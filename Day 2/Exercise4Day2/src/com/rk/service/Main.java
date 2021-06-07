package com.rk.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.rk.database.DataCD;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CDViewer cd = new CDViewer();
		DataCD data = new DataCD();
		data.addCD();
		ArrayList<CD> list = (ArrayList<CD>) data.getList();
		for(int index = 0;index<list.size();index++)
			cd.addCD(list.get(index));
		System.out.println("Title\t\t\tSinger");
		System.out.println("------------------------------------");
		for(String title : cd.getCd().keySet()) {
			cd.displayCD(title);
		}
	}
}