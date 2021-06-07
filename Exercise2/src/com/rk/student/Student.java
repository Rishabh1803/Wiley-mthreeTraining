package com.rk.student;

public class Student {
	private int MarksInEng, MarksInMaths, MarksInScience, RollNo;
	private String StudName;
	private double Percentage;

	public double getPercentage() {
		return Percentage;
	}

	public void setPercentage(double Percentage) {
		this.Percentage = Percentage;
	}

	public void setMarksInEng(int marksInEng) {
		MarksInEng = marksInEng;
	}

	public void setMarksInMaths(int marksInMaths) {
		MarksInMaths = marksInMaths;
	}

	public void setMarksInScience(int marksInScience) {
		MarksInScience = marksInScience;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public void setStudName(String studName) {
		StudName = studName;
	}

	public int getRollNo() {
		return RollNo;
	}

	public int getMarksInEng() {
		return MarksInEng;
	}
	
	public int getMarksInMaths() {
		return MarksInMaths;
	}
	
	public int getMarksInScience() {
		return MarksInScience;
	}
	
	public String getStudName() {
		return StudName;
	}

	public Student() {
		
	}
	public Student(int marksInEng, int marksInMaths, int marksInScience, String studName, int rollNo) {
		MarksInEng = marksInEng;
		MarksInMaths = marksInMaths;
		MarksInScience = marksInScience;
		StudName = studName;
		RollNo = rollNo;
		Percentage = (MarksInEng + MarksInMaths + MarksInScience)/3.0;
	}
}