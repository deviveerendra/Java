package com.ngs.java.Interfaces;
/*
*@class Multipleinterfaceimplementation
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Multipleinterfaceimplementation implements Multipleinterface,Multipleinterface1 {
	/*
	 *
	 * Implementing multiple interfaces
	 * 
	 */

	public void eat(){
		System.out.println("animal eats");
	}
	public void drinks(){
		System.out.println("animal drinks");
	}
	
	
	public static void main(String[] args) {
		Multipleinterfaceimplementation multipleinterfaceimplementation = new Multipleinterfaceimplementation();
		multipleinterfaceimplementation.drinks();
		multipleinterfaceimplementation.eat();
		
		
		Multipleinterface multipleinterface;
		multipleinterface=new Multipleinterfaceimplementation();
		multipleinterface.eat();
		
		Multipleinterface1 multipleinterface1;
		multipleinterface1=new Multipleinterfaceimplementation();
		multipleinterface1.drinks();
		
	}
}
