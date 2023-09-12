//Program to demonstrate Multiple catch block
package com.tnsif.dayeleven.multiplecatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchDemo {
	public static void main(String[] args) {
		System.out.println("I am in main method");
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		while (true) {
			try {
				a = sc.nextInt();
				b = sc.nextInt();
				c = a / b;
				System.out.println("Division is " + c);
				break;
			} catch (InputMismatchException e) {
				// e.printStackTrace();
				System.out.println("Invalid input. Please enter integers only.");
				sc.nextLine();
			} catch (ArithmeticException e) {
				System.out.println("Exception caught: " + e.getMessage());
				break;
			} catch (Exception e) {
				System.out.println("Exception caught: " + e.getMessage());
				break;
			}
		}
		sc.close();
	}
}