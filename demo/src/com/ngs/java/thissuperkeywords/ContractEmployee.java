package com.ngs.java.thissuperkeywords;
/*
*@class   ContractEmployee 
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public class ContractEmployee extends Employee1{
	//int empid;
	ContractEmployee(){
    	//default constructor
	}
    
    /*
	 *
	 * ContractEmployee is a parameterized constructor is used to call super class parameterized constructor and displays on console
	 * 
	 */
	ContractEmployee(int empid){
	    super(empid);
		System.out.println(empid);
	}
	
}
