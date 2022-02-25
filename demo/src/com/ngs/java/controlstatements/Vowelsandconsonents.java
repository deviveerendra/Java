package com.ngs.java.controlstatements;

import java.util.Scanner;
/**
*@class   Vowelsandconsonents
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public class Vowelsandconsonents{

    /*
	 *
	 * This method will take input from user and check vowels and consonents and displays on console
	 * 
	 */
	public void vowelsorconsonents(){
		Scanner sc=new Scanner(System.in);
	        System.out.println("enter character");
	        char s=sc.next().charAt(0);
                if(s== 'A' || s=='E' || s=='I' || s=='O' || s=='U' || s=='a' || s=='e' || s=='i' || s=='o' || s=='u'){
			    System.out.println("enter character "+s+ " is vowel");
		        }else{
			            System.out.println("enter character "+s+ " is consonent");
			          }
	        }
	
}