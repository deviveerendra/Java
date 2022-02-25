package com.ngs.java.javabasics;

import java.util.Scanner;
/**
*@class   Namecollegeage
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
 public class Namecollegeage{
    /*
	 *
	 * This method will take values from user and displays on console
	 * 
	 */
	 public void scanner1(){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter name of the student");
	   String x=sc.nextLine();
	   System.out.println("enter name of a college");
	   String y=sc.nextLine();
	   System.out.println("enter age of a student");
	   int z=sc.nextInt();
	   System.out.println("name of a student is "+x+" ,name of a college is "+y+" ,age of a student is "+z);
	   System.out.println("name of a student is "+ x + "\n name of a college is "+ y + "\n age of a student is "+z);
	 }	
}