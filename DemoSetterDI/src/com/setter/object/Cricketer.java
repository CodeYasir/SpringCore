package com.setter.object;

public class Cricketer{

	private String name;
	private int id;
    private Address add;

    
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public String getdetails() {
	  return id+ " "+name+" "+add.getAddress();
	}
	
	
}
