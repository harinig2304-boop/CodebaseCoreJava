//Program to define Voter entity  
package com.tnsif.daytwelve;

public class Voter {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Voter [name=" + name + ", age=" + age + "]";
	}

}
