package com.ngs.java.thissuperkeywords;
/*
*@class   Person
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public class Person {
	String name;
	int empid;
	
	/*
	 *
	 * It is a Parameterized Constructor used to assign values to Instance Variables
	 * 
	 */

	Person(String name,int empid){
		this.name=name;
		this.empid=empid;
		System.out.println("Name is "+name+" Emp id is "+empid);
	}
	

}
