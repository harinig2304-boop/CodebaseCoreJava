package com.tnsif.daytwelve;

import java.util.Arrays;

public class Batch {
	String batchCode;
	Student[] students;
	int batchSize;
	
	public String getBatchCode() {
		return batchCode;
	}

	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}



	public Student[] getStudents() {
		return students;
	}



	public void setStudents(Student[] students) {
		this.students = students;
	}



	public int getBatchSize() {
		return batchSize;
	}



	public void setBatchSize(int batchSize) {
		this.batchSize = batchSize;
	}

	public Student getTopper()
	{
		Student topStudent;
		topStudent=students[0];
		for(int i=1;i<students.length;i++)
		{
			if (topStudent.getPer()<students[i].getPer())
				topStudent=students[i];
				
		}
		return topStudent;
	}

	@Override
	public String toString() {
		return "Batch [batchCode=" + batchCode + ", students=" + Arrays.toString(students) + ", batchSize=" + batchSize
				+ "]";
	}
	
}
