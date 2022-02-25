package com.ngs.java.datatypesvariablesoperators;

/**
*@class   Operators
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Operators{
	int a;
	float b;
	float c;
	float d;
	double e;
	double f;

    /*
	 *
	 * This method used to perform various operations and displays values on console
	 * 
	 */
	
	public void operator(){
		a= -5 + 7 * 6;
		System.out.println("value of a is "+a);
		b=(55+4) % 9f ;
		System.out.println("value of b is "+b);
		c=20 + -4*5 / 8f ;
		System.out.println("value of c is "+c);
		d=5 + 27/ 3 * 2 - 8 % 3f ;
		System.out.println("value of d is "+d);
		e=((25.5  * 3.5  - 3.5  * 3.5 ) / (40.5  - 4.5 )) ;
		System.out.println("value of e is "+e);
		f= 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
		System.out.println("value of f is "+f);
		
		
		
	}
	
}