//Program to demonstrate user defined exception
package com.tnsif.daytwelve;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VoterInfo {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Name and age of voter : ");
			String name;
			int age;

			try {
				name = sc.nextLine();
				age = sc.nextInt();
				if (Validator.validateAge(age)) {
					Voter v = new Voter();
					v.setName(name);
					v.setAge(age);
					System.out.println(v + " added in voter list");
				}
			} catch (InvalidAgeException e) {
				System.out.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("Invalid input");
			}
		}

	}

}
