package com.ngs.java.methods;

import java.util.Scanner;

/**
*@class   Positiveandnegitive
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/


public class Positiveandnegitive
{
    /*
	 *
	 * This method will take input from user to check enter number is positive or negitive
	 * 
	 */ 
	public void number(){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter number");
	  int s=sc.nextInt();
	  if(s>0)
	  {
	   System.out.println("entered number  " +s+ " is positive ");
	  }else if(s==0)
	  {
		System.out.println("entered number  " +s+ " is neither positive nor negitive");
	  }else
	  {
		System.out.println("entered number  " +s+ " is negitive");
		
	  }
	}
}