package com.ngs.java.Interfaces;

/*
*@class   Tamilnadubill
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Tamilnadubill implements Abstractionandinterface {
	
	/*
	 *
	 * abstract methods implementation 
	 * 
	 */

	public void electricitybill(int units){
		int unit=units*80;
		System.out.println("electricitybill is"+unit);
	}
	public void waterbill(int units){
		int hi=units*100;
		System.out.println("waterbill is"+hi);
	}
	public void Internetbill(int units){

		int inter=units*56;
		System.out.println("internetbill is"+inter);
		
	}

}
