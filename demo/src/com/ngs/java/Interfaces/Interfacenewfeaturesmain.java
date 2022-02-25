package com.ngs.java.Interfaces;
/*
*@interface   Interfacenewfeaturesmain
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Interfacenewfeaturesmain implements Interfacenewfeatures {
	public void hii(){
		System.out.println("hii"); //abstract method implemented
	}
	
	/*
	 *
	 * In main method interface implementation class object is created and called the methods 
	 * 
	 */

	public static void main(String[] args) {
		
		Interfacenewfeaturesmain a=new Interfacenewfeaturesmain();
		a.method();
		a.hii();
		Interfacenewfeatures.method1();
	}


}
