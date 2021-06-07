package com.rk.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.rk.database.Data;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Directory directory = new Directory();		
		Data data = new Data();
		data.addData();
		ArrayList<Record> list = (ArrayList<Record>) data.getList();
		for(int index = 0 ; index < list.size() ; index++)
			directory.addDetail(list.get(index));
		System.out.println("Name\t\tPhone Number");
		System.out.println("---------------------------------");
		for(String name : directory.getTelephone().keySet()) {
			directory.displayRecord(name);
		}
		sc.close();
	}

}
