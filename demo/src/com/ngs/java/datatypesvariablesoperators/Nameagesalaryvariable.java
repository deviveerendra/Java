package com.ngs.java.datatypesvariablesoperators;

import java.util.Scanner;
/**
*@class   Nameagesalaryvariable
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Nameagesalaryvariable{
	String name;
	int age;
	double salary;

    /*
	 *
	 * This method will take values from user and displays on console
	 * 
     */
	public void scanner2(){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter name");
	  name=sc.nextLine();
	  System.out.println("enter age");
	  age=sc.nextInt();
	  System.out.println("enter salary");
	  salary=sc.nextInt();
	  System.out.println("name is "+name+" ,age is "+age+" ,salary is "+salary);
	  System.out.println("name is "+ name + "\n age is "+ age + "\n salary is "+salary);
		
		
	}
}