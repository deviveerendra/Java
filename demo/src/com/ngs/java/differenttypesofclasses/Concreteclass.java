package com.ngs.java.differenttypesofclasses;

/**
*@class   Concreteclass
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public class Concreteclass{
	int i=9;
	int j=23;
	public void concrete(){  //concrete method
		System.out.println("hii concrete");
		System.out.println("sum is "+(i+j));
	}
	public static void main(String[] args) { 
	        Concreteclass a=new Concreteclass(); //object is created
	        a.concrete();//calling the method
	}
	
}
