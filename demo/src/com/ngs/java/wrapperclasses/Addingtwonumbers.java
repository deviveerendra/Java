package com.ngs.java.wrapperclasses;

import java.util.Scanner;

public class Addingtwonumbers {
	int a,b;
	public String toString(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first value");
	    a=sc.nextInt();
		System.out.println("Enter second value");
		b=sc.nextInt();
		return Integer.toString((a+b));
	}
	

}
