package com.constructor.object;

public class Cricketer{

	private Address add;

	//define constructor

	public Cricketer( Address add) {
		super();
		this.add = add;
	}
	public void getdetails() {
	  System.out.println(add.getAddress());
	}

}
