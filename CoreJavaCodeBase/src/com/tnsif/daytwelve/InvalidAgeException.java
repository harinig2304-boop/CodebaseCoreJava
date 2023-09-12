//Program to define User Defined Exception class
package com.tnsif.daytwelve;

public class InvalidAgeException extends Exception {
	InvalidAgeException() {
		super("Invalid age.");
	}

	InvalidAgeException(String message) {
		super(message);
	}
}
