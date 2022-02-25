package com.ngs.java.stringsstringbuffer;

import java.util.Scanner;

/*
*@class   ReverseString
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Reversestring {
	Scanner sc= new Scanner(System.in);
	String name;
	
   /*
    *
    * In this method name is taken from user and print it reverse
    * 
    */
	
	public void scanner(){
		String reverse="";
		System.out.println("Enter a name");
		name= sc.nextLine();
		int length= name.length();
		for(int i=length-1;i>=0;i--){
			 reverse=reverse+name.charAt(i);
		}
		System.out.println("Reverse is "+reverse);
		
	}
	
   /*
    *
    * In this method name is taken from user and print it reverse by using stringBuffer
    * 
    */
	
	public void stringbufferreverse(){
		System.out.println("Enter name");
		name=sc.nextLine();
		StringBuffer sb=new StringBuffer(name);
		System.out.println("Reverse is "+sb.reverse());
	}
	
   /*
    *
    * In this method name is taken from user and print it reverse by using stringBuilder
    * 
    */
	
	public void stringbuilder(){
		System.out.println("Enter name");
		name=sc.nextLine();
		StringBuilder sb=new StringBuilder(name);
		System.out.println("Reverse is "+sb.reverse());
	}
	
	public static void main(String[] args) {
	    Reversestring reversestring = new Reversestring(); //object is created
		reversestring.scanner(); //method is called
		reversestring.stringbufferreverse(); //method is called
		reversestring.stringbuilder(); //method is called
	}


}
