package com.ngs.java.differenttypesofclasses;

import java.util.Scanner;
/*
*@class   Staticclass
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Staticclass {
	static int x; //static variable
	static void hii(int a,int b){ //static method
		x= a + b;
		System.out.println("sum is "+x);
	}
	static class Innerclass { //static innerclass
		public void inner() { //innerclass method
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int c=sc.nextInt();
		System.out.println("Enter Second number");
		int d=sc.nextInt();
		hii(c,d);//assigning values
	}
		
	}
	  
	
	
}