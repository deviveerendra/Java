package com.ngs.java.thissuperkeywords;
/*
*@class   Subclass
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Subclass extends Super {
	int a=10;
	
	
	public void dev(){
		super.dev();   //calling super class dev method
		System.out.println("hii");
		System.out.println(a);
		System.out.println(super.a); //calling super class variable
	}
	Subclass(int a,int b){
		super(a,b); //assign values to super class constructor 
		System.out.println("sum is "+(a+b));
		
	}
	public static void main(String[] args) {
		Subclass subclass = new Subclass(34,56);
		subclass.dev();
		
	}

}
