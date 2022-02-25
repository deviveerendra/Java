package com.ngs.java.javabasics;

import java.util.Scanner;
/**
*@class   Append
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Append{

    /*
	 *
	 * This method will take input from user and displays the value on console
	 * 
	 */

	public void scanner(){
	    System.out.println("Please enter input");
		Scanner sc=new Scanner(System.in);
		String d=sc.nextLine();
		System.out.println("you have entered is "+d);
	}
}