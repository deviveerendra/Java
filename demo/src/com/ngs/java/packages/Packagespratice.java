package com.ngs.java.packages;
import com.ngs.java.overidinganddynamic.C1;

/*
*@class   Packagespratice
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/


public class Packagespratice {
	public static void main(String[] args) {  
		//creating object after importing 
		C1 a=new C1();
		a.concrete1();
	    com.ngs.java.overidinganddynamic.C2 d=new com.ngs.java.overidinganddynamic.C2(); //without importing package
	    d.concrete();
	    d.concrete1();
	}
	

}
