package com.ngs.java.overidinganddynamic;

/*
*@class   C3
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class C3 extends C1{
	
	/*
	 *
	 * Method overriding
	 * 
	 */
	
	public void concrete(){
		System.out.println("hello bye");
	}

	public static void main(String[] args) {
		C1 c1 = new C1();
		c1.concrete();
		C2 c2=new C2();
		c2.concrete();
		C3 c3=new C3();
		c3.concrete();
		
		C1 d1;
		d1=new C2();
		d1.concrete();
		d1.concrete1();
		d1=new C3();
		d1.concrete();
		
	}


}
