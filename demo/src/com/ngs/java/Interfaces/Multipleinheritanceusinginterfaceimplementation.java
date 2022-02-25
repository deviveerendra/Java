package com.ngs.java.Interfaces;
/*
*@class   Multipleinheritanceusinginterfaceimplementation
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Multipleinheritanceusinginterfaceimplementation implements Multipleinheritanceusinginterface,Multipleinheritanceusinginterface1 {
	
	/*
	 *
	 * Implementing multiple inheritance
	 * 
	 */

	public void eat(){
		System.out.println("animal eats");
	}
	
	public static void main(String[] args) {
		Multipleinheritanceusinginterfaceimplementation multipleinheritanceusinginterfaceimplementation = new Multipleinheritanceusinginterfaceimplementation();
		multipleinheritanceusinginterfaceimplementation.eat();
	}


}
