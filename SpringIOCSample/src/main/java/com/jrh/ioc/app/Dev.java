package com.jrh.ioc.app;

public class Dev {

	private Computer computer;
	
	private String name;
	private int age;
	
	
	public Dev(Computer computer, String name, int age) {
		super();
		this.setComputer(computer);
		this.name = name;
		this.age = age;
		System.out.println("Dev parameterized constructor");
	}

	public Dev() {
		super();
		System.out.println("Dev constructor");
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void build() {
		System.out.println("Dev Name:"+this.name+" aged "+this.age +" building project");
		computer.compile();
	}


	public Computer getComputer() {
		return computer;
	}


	public void setComputer(Computer computer) {
		this.computer = computer;
	}
}
