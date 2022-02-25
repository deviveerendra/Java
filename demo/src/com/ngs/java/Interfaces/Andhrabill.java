package com.ngs.java.Interfaces;

/*
*@class   Andhrabill
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/



public class Andhrabill implements Abstractionandinterface {
	
	/*
	 *
	 * abstract methods implementation
	 * 
	 */
	
	public void electricitybill(int units){
		int unit=units*5;
		System.out.println("electricitybill is"+unit);
	}
	public void waterbill(int units){
		int unit=units*10;
		System.out.println("waterbill is"+unit);
		
	}
	public void Internetbill(int units){

		int inter=units*43;
		System.out.println("internetbill is"+inter);
		
	}

}
