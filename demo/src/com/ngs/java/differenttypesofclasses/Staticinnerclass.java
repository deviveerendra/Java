package com.ngs.java.differenttypesofclasses;

/*
*@class   Staticinnerclass
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Staticinnerclass{
	void outer(){ //concrete method
		System.out.println("outer");
	}
	static class inner{ //inner static class
		void dev(){ //concrete method
			System.out.println("inner");
		}
	}
}