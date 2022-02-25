package com.ngs.java.methods;

import java.util.Scanner;

/**
*@class   Arthimeticoperation
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public class Arthimeticoperation{
    /*
	 *
	 * This method will take input from user and do some operations and display the values on console
	 * 
	 */
	public void scanner3(){
	  Scanner sc=new Scanner(System.in);
      System.out.println("enter first value");
	  int d=sc.nextInt();
	  System.out.println("enter second value");
	  int e=sc.nextInt();
	  System.out.println("addition of two numbers is "+(d+e));
	  System.out.println("substraction of two numbers is "+(d-e));
	  System.out.println("multiplication of two numbers is "+(d*e));
	  System.out.println("dividing of two numbers is "+(d/e));
	}
}