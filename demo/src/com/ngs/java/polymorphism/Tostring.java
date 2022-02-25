package com.ngs.java.polymorphism;
/*
*@class   Tostring 
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public class Tostring {
	String name;
	int age;
	String address;
	
	/*
	 *
	 * Tostring is a constructor is used to assign values to instance variables
	 * 
	 */
	Tostring(String name,int age,String address){
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
	/*
	 *
	 * overriding toString() method
	 * 
	 */
	
	public String toString(){
		return "name is "+name+" age is "+age+" address is "+address;
		
	}//overriding toString method
	public static void main(String[] args) {
		Tostring tostring = new Tostring("veeru",23,"rajahmundry");
		System.out.println(tostring);
	}

}
