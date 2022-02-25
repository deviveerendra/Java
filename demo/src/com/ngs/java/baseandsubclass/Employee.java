package com.ngs.java.baseandsubclass;
/*
*@class   Employee
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public class Employee extends Person {
	double salary;
	int year;
	String insurancenumber;
	/*
	 *
	 * Employee is a parameterized constructor and assigns values to instance variables
	 * 
	 */
	Employee(double salary,int year,String insurancenumber ){
		this.salary=salary;
		this.year=year;
		this.insurancenumber=insurancenumber;
		}
	/*
	 *
	 * print is a method used to display values on console
	 * 
	 */
	public void print(){
		 System.out.println("salary is "+salary);
		 System.out.println("year is "+year);
		 System.out.println("insurancenumber is "+insurancenumber);
		 
	}
	
   
}
