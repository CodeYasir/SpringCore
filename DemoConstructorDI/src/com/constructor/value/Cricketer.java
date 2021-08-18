package com.constructor.value;

public class Cricketer{

	private String name;
	private int id;

	//define constructor
	
	public Cricketer(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public void getdetails() {
	  System.out.println(id+ " "+name);
	}
}
