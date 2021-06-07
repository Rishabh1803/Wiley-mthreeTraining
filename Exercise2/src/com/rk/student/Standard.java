package com.rk.student;

public class Standard {
	private Student[] students;
	private int total;
	
	public Standard(int totalNoOfStudents) {
		total = totalNoOfStudents;
		students = new Student[total];
	}
	
	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public void setParticularStudent(int i, String name, int marksEng, int marksMath, int marksSci) {
		students[i] = new Student(marksEng, marksMath, marksSci, name, i+1);
	}
	
	public int getTotal() {
		return total;
	}

	public void displayStudent(int index) {
		System.out.println(students[index].getRollNo() + "\t" + students[index].getStudName());
	}
	
	public int highestPercentage() {
		int indexHigh = 0;
		for(int i = 1; i<students.length ; i++) {
			if(students[i].getPercentage() > students[indexHigh].getPercentage())
				indexHigh = i;
		}
		return indexHigh;
	}
	
	public int highestMath() {
		int indexHigh = 0;
		for(int i = 1; i<students.length ; i++) {
			if(students[i].getMarksInMaths() > students[indexHigh].getMarksInMaths())
				indexHigh = i;
		}
		return indexHigh;
	}
}