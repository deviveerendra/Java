package com.ngs.java.Interfaces;

/*
*@class   Interfaceinheritanceimplementation
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/


public class Interfaceinheritanceimplementation implements Interfaceinheritance1 {
	
	/*
	 *
	 * abstract methods implementation 
	 * 
	 */
	public void eat(){
		System.out.println("Animal eats");
		
	}
	public void drinks(){
		System.out.println("Animal drinks");
	}
	
	public static void main(String[] args) {
		Interfaceinheritanceimplementation interfaceinheritanceimplementation = new Interfaceinheritanceimplementation();
		interfaceinheritanceimplementation.drinks();
		interfaceinheritanceimplementation.eat();
	}


}
