package com.jrh.ioc.app;

public class Desktop implements Computer{
	
	private String name;
	
	public Desktop(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void compile() {
		System.out.println("Compiling with Desktop [ "+this.name+" ]");
	}
}
