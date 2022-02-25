package com.ngs.java.overidinganddynamic;
/**
*@class   Circletrirecmain
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public class Circletrirecmain {
	
	/*
	 *
	 * main method creates object to s,s1,s2 and calling that class methods by using reference variable
	 * 
	 */
	public static void main(String[] args) {
		Shapes shapes;
		shapes=new Shapes();
		shapes.draw();
		shapes=new Circle1();
		shapes.draw();
		
		Shapes shapes1;
		shapes1=new Shapes();
		shapes1.draw();
		shapes1=new Triangle();
		shapes1.draw();
		
		Shapes shapes2;
		shapes2=new Shapes();
		shapes2.draw();
		shapes2=new Rectangle();
		shapes2.draw();
		 
		
	}

}
