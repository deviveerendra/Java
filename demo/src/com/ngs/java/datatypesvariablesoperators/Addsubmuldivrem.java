package com.ngs.java.datatypesvariablesoperators;

import java.util.Scanner;
/**
*@class   Addsubmuldivrem
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public class Addsubmuldivrem{
    /*
	 *
	 * This method will take input from the user and do operations and displays the result on console
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
	  System.out.println("remaider of two numbers is "+(d%e));
	
	
	
	}
}