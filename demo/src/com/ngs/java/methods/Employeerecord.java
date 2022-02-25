package com.ngs.java.methods;

import java.util.Scanner;
/**
*@class   Employeerecord
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public class Employeerecord{
	public void scanner5(){
	String proceed="yes";
    /*
	 *
	 * This method will take input from user and displays values on console
	 * 
	 */
	while((proceed.equals("yes"))|| (proceed.equals("Yes")))//check the condition
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter name");
	  String name=sc.nextLine();
	  System.out.println("enter age");
	  int age=sc.nextInt();
	  System.out.println("enter salary");
	  int salary=sc.nextInt();
	  System.out.println("enter designation");
	  String designation=sc.nextLine();
	
	  System.out.println("name is "+name+" ,age is "+age+" ,salary is "+salary+",designation is "+designation );
	  System.out.println("enter yes to proceed and enter no to exit");
	  proceed=sc.next();
		
		
	}
	}
}