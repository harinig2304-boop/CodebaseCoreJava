package com.tnsif.daytwelve;

import java.util.Scanner;

public class Executor {

	public static void main(String[] args) {
		try
		{

		Batch b01=new Batch();
		b01.setBatchCode("TC050401");
		b01.setBatchSize(10);
		
		Student studentArray[]=new Student[2];
		studentArray[0]=new Student();
		studentArray[0].setRollNo(1);
	
		studentArray[0].setMarks(new int[] {45,67,89});
		studentArray[0].setNoOfSubjects(studentArray[0].getMarks().length);
		studentArray[0].setName("Nihal");
		studentArray[0].calculatePercentage();
		
		studentArray[1]=new Student();
		studentArray[1].setRollNo(2);
		studentArray[1].setMarks(new int[] {50,60,80});
		studentArray[1].setNoOfSubjects(studentArray[1].getMarks().length);
		studentArray[1].setName("Vishal");
		studentArray[1].calculatePercentage();
		
		b01.setStudents(studentArray);
		System.out.println(b01);
		
		System.out.println(b01.getTopper());
		}catch(InvalidMarksException ime)
		{
			System.out.println("Error..."+ime.getMessage());
		}
		catch(NullPointerException | ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
