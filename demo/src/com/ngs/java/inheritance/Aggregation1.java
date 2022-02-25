package com.ngs.java.inheritance;

public class Aggregation1 {
	Aggregation aggregation;
	String email;
	String pincode;
	public Aggregation1(String email,String pincode,Aggregation aggregation){
		this.email=email;
		this.pincode=pincode;
		this.aggregation=aggregation;
		
	}
	public void display(){
		System.out.println("Name is "+aggregation.name+"Roll number "+aggregation.rollno+"Age is "+aggregation.age);
		System.out.println("Email is "+email+"Pincode is "+pincode);
	}

}
