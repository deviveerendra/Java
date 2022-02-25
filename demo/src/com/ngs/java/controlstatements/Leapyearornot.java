package com.ngs.java.controlstatements;

import java.util.Scanner;
/**
*@class   Leapyearornot
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public class Leapyearornot{
    /*
	 *
	 * This method will take input from user and check whether the giving input is leap year or not
	 * 
	 */
	public void leapornot(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		if(((a%4==0)&& (a%100!=0))|| (a%400==0)){
			System.out.println("entered number is leap year");
		}else{
			System.out.println("entered number is not leap year");
		}
		
	}
}