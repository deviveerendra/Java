package com.ngs.java.statickeyword;
/*
*@class   Ceilandfloormain  
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public class Mainclass {
	/*
	 *
	 * main method creates object to Ceilandfloormain class ,calling that method by using reference variable
	 * 
	 */
	public static void main(String args[]){
		Ceilandfloor ceilandfloor = new Ceilandfloor(); //object is created for Ceilandfloor class 
		ceilandfloor.areaperimeter();
		
		Circle circle = new Circle(); //object is created for Circle class
		circle.areaperimeter();
		
		Practicestatic.staticmethod(); 
		Practicestatic practicestatic = new Practicestatic(); //object is created for Practicestatic class
		practicestatic.nonstaticmethod();
		practicestatic.nonstaticmethod1();
		
		Staticdemo staticdemo = new Staticdemo(); //object is created for Staticdemo class
		staticdemo.nonstaticmethod();
		Staticdemo.staticmethod();


	}


}
