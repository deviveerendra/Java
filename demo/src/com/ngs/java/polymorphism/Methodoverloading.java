package com.ngs.java.polymorphism;

/*
*@class   Methodoverloading
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/


public class Methodoverloading {
	
	/*
	 *
	 * Method overloading
	 * 
	 */
	public void overloading(){
		System.out.println("hi");
	}
	public void overloading(int a){
		System.out.println("hello");
	}
	public void overloading(int a,int b){
		System.out.println("bye");
	}
	public static void  overloading(int a,int b,int c){//static methods are not overridden
		System.out.println("addition is "+ (a + b + c));
		
	}

}
