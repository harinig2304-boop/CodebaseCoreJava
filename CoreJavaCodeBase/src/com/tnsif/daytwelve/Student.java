package com.tnsif.daytwelve;

import java.util.Arrays;

public class Student {
	private int rollNo;
	private String name;
	private int[] marks;
	private int noOfSubjects;
	private float per;
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) throws InvalidMarksException {
		for(int ele:marks)
		{
			if (ele<0 || ele>100)
				throw new InvalidMarksException("Marks should be between 0 to 100");
		}
		this.marks = marks;
	}

	public int getNoOfSubjects() {
		return noOfSubjects;
	}

	public void setNoOfSubjects(int noOfSubjects) {
		this.noOfSubjects = noOfSubjects;
	}

	public void calculatePercentage()
	{
		int total=0;
		for(int value:marks)
			total+=value;
		per=total/noOfSubjects;
		
	}
	
	public float getPer()
	{
		return this.per;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + Arrays.toString(marks) + ", noOfSubjects="
				+ noOfSubjects + "Percentage : "+per+" ]";
	}

}
