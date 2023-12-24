package com.cucumber;

public class Base {
	
	
	public static void main(String[] args) {
		
		Base obj = new Base(22, "jitendra", false, 'a');
		
		System.out.println(obj.age);
	}
	
	int age ;
	String name ;
	//int salary ;
	boolean status;
	char c ;
	/**
	 * @param age
	 * @param name
	 * @param salary
	 * @param status
	 * @param c
	 */
	public Base(int age, String name,  boolean status, char c) {
		super();
		this.age = age;
		this.name = name;
		//this.salary = salary;
		this.status = status;
		this.c = c;
	}
	
	

}
