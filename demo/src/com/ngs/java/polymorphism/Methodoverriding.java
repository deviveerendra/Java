package com.ngs.java.polymorphism;
/*
*@class   Methodoverriding
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Methodoverriding extends Methodoverloading{
	
	/*
	 *
	 * Method overriding
	 * 
	 */
	public void overriding(){
		System.out.println("hi dev");
	}
	public void overriding(int a){
		System.out.println("hi krishna "+ a);
	}
	public void overriding(int a,int b){
		System.out.println("hi veeru "+ (a + b));
	}
	public static void  overriding(int a,int b,int c){
		System.out.println("hiiii "+ (a + b + c));
		
	}

}
