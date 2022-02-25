package com.ngs.java.differenttypesofclasses;

/*
*@class   Annonymousinnerclassmain
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public class Annonymousinnerclassmain{
	public static void main(String[] args) { 
	   Annonymousinnerclass a=new Annonymousinnerclass() //object is created
	              {
				    void dev(){   //overiding method
				    super.dev();  
				    System.out.println("hii krishna");
				  }
		                       
	              };
				  a.dev();//calling the method
	   
	}
	
}