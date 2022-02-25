package com.ngs.java.differenttypesofclasses;

/*
*@class   Methodlocalinnerclass
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Methodlocalinnerclass{
	void inner(){
		System.out.println("outer");//concrete method
	class local{ //inner class
		void dev(){
		System.out.println("inner");//method inside inner class
	}
	}
	local i=new local();//object is created to local class
	i.dev();//calling the method
	}
}