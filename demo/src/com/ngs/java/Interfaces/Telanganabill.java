package com.ngs.java.Interfaces;

/*
*@class   Telanganabill
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/


public abstract class Telanganabill implements Abstractionandinterface {
	
	/*
	 *
	 * abstract methods implementation 
	 * 
	 */

	public void electricitybill(int units){
		int unit=units*34;
		System.out.println("electricitybill is"+unit);
	}
	public void waterbill(int units){
		int hi=units*12;
		System.out.println("waterbill is "+hi);
	}

}
