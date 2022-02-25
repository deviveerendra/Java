package com.ngs.java.finalkeyword;
/*
*@class   Final
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/


public class Final {
	final int a=10;
	final int b;
	final static int c;
	Final(){  //assigning value to final variable
		b=20;
	}
	static{  //assigning values to final static variable
		c=23;
		System.out.println(c);
	}
	final void dev(){ //final method
		System.out.println("dev");
	}
	void pratice(final int a){ //final local variable
		System.out.println(a);
	}

}
