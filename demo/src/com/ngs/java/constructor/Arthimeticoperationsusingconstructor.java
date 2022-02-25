package com.ngs.java.constructor;
/*
*@class   Arthimeticoperationsusingconstructor  
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Arthimeticoperationsusingconstructor {
	int a,b;
	/*
	 *
	 * Accountusingconstructors is a parameterized constructor used to assigns values to instance variables 
	 * 
	 */
	Arthimeticoperationsusingconstructor(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println("Addition is "+(a+b));
		System.out.println("substration is "+(a-b));
		System.out.println("multiplication is "+(a*b));
		System.out.println("division is "+(a/b));
		
	}
	/*void Arthimeticoperationsusingconstructor1(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println("substration is "+(a-b));
	}
	public void mul(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println("multiplication is "+(a*b));
	}
	public void div(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println("division is "+(a/b));
	}
	*/

}
