package com.ngs.java.differenttypesofclasses;

/*
*@class   Finalclass
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public final class Finalclass{
	public void concrete(){
		System.out.println("hii");//concrete method 
	}
	public static void main(String[] args) {
         Finalclass finalclass = new Finalclass();//creating object
         finalclass.concrete();//calling method		 
	}
} 