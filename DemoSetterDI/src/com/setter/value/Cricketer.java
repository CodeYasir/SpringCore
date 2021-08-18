package com.setter.value;

public class Cricketer{

	private String name;
	private int id;

	
	
	public void setName(String name) {
		this.name = name;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void getdetails() {
	  System.out.println(id+ " "+name);
	}
}
