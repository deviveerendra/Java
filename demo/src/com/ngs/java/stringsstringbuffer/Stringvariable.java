package com.ngs.java.stringsstringbuffer;
/*
*@class   Stringvariable
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Stringvariable {
	String name="Devi veerendra Kothapalli";
	
	public void lowerandupper(){
		System.out.println(name.toLowerCase()+ "\n"  + name.toUpperCase()); //converting name into lower and upper cases
		System.out.println("First name is "+ name.substring(0, 4)); //Displaying first name
		System.out.println("Middle name is "+ name.substring(5, 14)); //Displaying middle name
		System.out.println("Last name is "+ name.substring(15, 25)); //Displaying Last name
	}
	
	public static void main(String[] args) {
		Stringvariable stringvariable = new Stringvariable(); //object is created
		stringvariable.lowerandupper(); //calling the method

	}


}
