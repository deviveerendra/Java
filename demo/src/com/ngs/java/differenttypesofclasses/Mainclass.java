package com.ngs.java.differenttypesofclasses;

import com.ngs.java.differenttypesofclasses.Staticclass.Innerclass;

/*
*@class   Nestedclassmain
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public class Mainclass{
	public static void main(String[] args) {
		Nestedclass a=new Nestedclass();//object is created for Nested class
		a.i=10;
		System.out.println(a.i);
		Nestedclass.innerclass b=a.new innerclass();//creating object to inner class
		b.j=20;
		System.out.println(b.j);
		
		
		Innerclass innerclass = new Staticclass.Innerclass();//creating object to inner class
		innerclass.inner();//calling the method
		
		Methodlocalinnerclass methodlocalinnerclass = new Methodlocalinnerclass();//object is created for Methodlocalinnerclass class
		methodlocalinnerclass.inner();//calling the method

		  
	}
}