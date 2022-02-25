package com.ngs.java.datatypesvariablesoperators;

import java.util.Scanner;
/**
*@class   Nameagecollegebranchcity
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Nameagecollegebranchcity{
	String name;
	int age;
	String college;
	String branch;
	String city;
    /*
	 *
	 * This method will take input from user and displays the values
	 * 
	 */

	public void scanner5(){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter name");
	  name=sc.nextLine();
	  System.out.println("enter age");
	  age=sc.nextInt();
	  System.out.println("enter college");
	  sc.nextLine();
	  college=sc.nextLine();
	  System.out.println("enter branch");
	  branch=sc.nextLine();
	  System.out.println("enter city");
	  city=sc.nextLine();
	
	  System.out.println("name is "+name+" ,age is "+age+" ,college is "+college+",branch is "+branch +" ,city is " +city);
		
		
	}
}