package com.ngs.java.statickeyword;
/*
*@class   Practisestatic  
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public class Practicestatic {
	static int a=5;//static variable to static method
	static int b=6;
	int c=7;
	public static void staticmethod(){
		System.out.println(a);//static variable to static method
	}
	public void nonstaticmethod(){
		System.out.println(b);//static variable to non static method
	}
	public static void staticmethod1(){
		System.out.println();//non static variable to static method error
	}
	public void nonstaticmethod1(){
		System.out.println(c);//non static variable to non static method
	}
	
	

}
