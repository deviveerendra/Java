package com.ngs.java.iostreams;

import java.io.Serializable;

public class Vehicle implements Serializable {
	private String type;
	private int id;
	
	public Vehicle(String type, int id) {
		this.type = type;
		this.id = id;
	}

	@Override
	public String toString() {
		
		return "Vehicle is type=" + type + ", id=" + id + "";
	}
	
    
	
	
	

}
