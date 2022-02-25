package com.ngs.java.controlstatements;

import java.util.Scanner;
/**
*@class   Elegibilevote
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public class Elegibilevote{
    /*
	 *
	 * This method will take input from user and check you are elegible to vote or not
	 * 
	 */
	public void eighteen(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int a=sc.nextInt();
		if(a>=18){
			System.out.println("you are elegible to vote");
		}else{
			System.out.println("you are not elegible to vote");
		}
		
	}
}