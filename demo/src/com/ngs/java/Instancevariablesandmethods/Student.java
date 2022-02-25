package com.ngs.java.Instancevariablesandmethods;
/*
*@class   Student 
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public class Student {
	private int rollnumber;
	private String name;
	private int marks;
	/*
	 *
	 * setData method will get values from parameters and assign it to private instance variables
	 * 
	 */
	public void setData(int rollnumber,String name,int marks){
		this.rollnumber=rollnumber;
		this.name=name;
		this.marks=marks;
		}
	/*
	 *
	 * displayData method is used to display the values
	 * 
	 */
	public void displayData(){
		System.out.println("rollnumber is "+rollnumber);
		System.out.println("name is "+name);
		System.out.println("marks is "+this.marks);
	}

}
 