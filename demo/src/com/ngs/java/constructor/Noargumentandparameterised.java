package com.ngs.java.constructor;
/*
*@class   Noargumentandparameterised  
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/


public class Noargumentandparameterised {
	private int rollnumber;
	private String name;
	private int marks;
	/*
	 *
	 * Noargumentandparameterised is a parameterized constructor and assigns values to instance variables
	 * 
	 */
	public Noargumentandparameterised(int rollnumber,String name,int marks){
		this.rollnumber=rollnumber;
		this.name=name;
		this.marks=marks;
			
	}
	/*
	 *
	 * Accountusingconstructors is a constructor used to display values on console
	 * 
	 */
	public Noargumentandparameterised(Noargumentandparameterised e){
	  System.out.println("name is "+e.name);
	  System.out.println("marks is "+e.marks);
	  System.out.println("rollnumber is "+e.rollnumber);
	 
	} 

}
