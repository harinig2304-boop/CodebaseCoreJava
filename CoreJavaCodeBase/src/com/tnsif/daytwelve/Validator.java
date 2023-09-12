//Program to define validator class and use throws
package com.tnsif.daytwelve;

public class Validator {
	static boolean validateAge(int age) throws InvalidAgeException {
		boolean isValid = false;
		if (age < 18)
			throw new InvalidAgeException("Invalid age. You are not eligible to vote.");
		else
			isValid = true;

		return isValid;

	}
}
