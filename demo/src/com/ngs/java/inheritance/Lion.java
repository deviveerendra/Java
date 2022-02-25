package com.ngs.java.inheritance;
/**
*@class   Lion
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Lion extends Animal{
	public void roar(){
		System.out.println("lion roars");//concrete method
	}
	public void eat(){
		System.out.println("lion eat only meat");//concrete method
	}
	
}