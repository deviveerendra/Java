package com.ngs.java.Instancevariablesandmethods;
/**
*@class  Arthimeticoperation  
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Arthimeticoperation {
	int a,b;
	/*
	 *
	 * Add method will get values from parameters and assign it to instance variables
	 * 
	 */
	public void Add(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println("Addition is "+(a+b));
	}
	/*
	 *
	 * sub method will get values from parameters and assign it to instance variables
	 * 
	 */
	public void sub(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println("substration is "+(a-b));
	}
	/*
	 *
	 * mul method will get values from parameters and assign it to instance variables
	 * 
	 */
	public void mul(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println("multiplication is "+(a*b));
	}
	/*
	 *
	 * div method will get values from parameters and assign it to instance variables
	 * 
	 */
	public void div(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println("division is "+(a/b));
	}

}
