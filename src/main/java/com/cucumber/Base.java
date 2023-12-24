package com.cucumber;

public class Base {
	
	
	public static void main(String[] args) {
		
		Base obj = new Base(22, "jitendra", false, 'a');
		
		System.out.println(obj.age);
		System.out.println(obj.name);
		System.out.println(obj.status);
		System.out.println(obj.c);
		Base obj1  = new Base();
	System.out.println(obj1.age = 80);
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
	
	public Base() {
		
		int age = 10;
		
	}
	

}
