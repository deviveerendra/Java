package com.ngs.java.thissuperkeywords;
/*
*@class   Salary
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Salary extends Person {
	int salary;
	
	/*
	 *
	 * It is a Parameterized Constructor
	 * 
	 */
	
	Salary(String name,int empid,int salary)
	{
		super(name,empid); //assign values to super class constructor
		this.salary=salary;
	}
	
	/*
	 *
	 * display method is used to display values
	 * 
	 */
	
	void display()
	{
	   System.out.println("name is "+name+" ,empid is "+empid+" ,salary is "+salary);	
		
	}
	
	public static void main(String[] args) {
		Salary salary = new Salary("dev",9,20000);
		salary.display();
	}

	

}
