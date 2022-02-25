package com.ngs.java.controlstatements;

import java.util.Scanner;
/**
*@class   Greaternumber
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public class Greaternumber{
    /*
	 *
	 * This method is used to take values from console to find greater number
	 * 
	 */
	public void greater(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		System.out.println("enter third number");
		int c=sc.nextInt();
		if(a>b && a>c){
			System.out.println("first number "+a +" is bigger");
		}else if(b>a && b>c)
		{
			System.out.println("second number "+b +" is bigger");
		}else if(c>a && c>b){
			System.out.println("third number "+c +" is bigger");
		}else {
			System.out.println("both a and b and c numbers are same");
		}
		
	}
}