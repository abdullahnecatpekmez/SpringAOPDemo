package org.spring.aop.model;

public class Circle {
	private String name;

	public String getName() {
		System.out.println("Circle getter called");
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Circle set method called");
	 //  throw (new RuntimeException(name));
	}
	public String setNameAndReturn(String name) {
		this.name = name;
		System.out.println("Circle set method called");
	 return name;
	}
	
}
