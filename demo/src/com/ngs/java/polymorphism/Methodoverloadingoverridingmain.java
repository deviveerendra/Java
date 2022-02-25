package com.ngs.java.polymorphism;
/*
*@class   Methodoverridingmain
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public class Methodoverloadingoverridingmain {
	/*
	 *
	 * main method creates object to Methodoverriding classes and calling that class methods by using reference variable
	 * 
	 */
	public static void main(String[] args) {
		Methodoverriding methodoverriding = new Methodoverriding();
		methodoverriding.overriding();
		methodoverriding.overriding(2);
		methodoverriding.overriding(3, 5);
		Methodoverriding methodoverriding2 = new Methodoverriding();
		methodoverriding2.overloading();
		methodoverriding2.overloading(89);
		methodoverriding2.overloading(39,89);
		Methodoverloading.overloading(23,34,56);
		
	}

}
