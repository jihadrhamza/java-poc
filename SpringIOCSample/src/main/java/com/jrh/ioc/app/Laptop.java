package com.jrh.ioc.app;

public class Laptop implements Computer {

	
	private String name;
	
	public Laptop(String name){
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void compile() {
		System.out.println("Compiling with Laptop [ "+this.name+" ]");
	}

}
