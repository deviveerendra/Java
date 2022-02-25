package com.ngs.java.differenttypesofclasses;

/*
*@class   Staticinnerclassmain
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Staticinnerclassmain{
	public static void main(String[] args) { 
	Staticinnerclass a=new Staticinnerclass();  //creating object
	a.outer(); //calling the method
	Staticinnerclass.inner b =new Staticinnerclass.inner(); //creating object to innerclass
	b.dev(); //calling the method
	}
	
}