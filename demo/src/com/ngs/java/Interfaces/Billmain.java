package com.ngs.java.Interfaces;

/*
*@class   Telanganaextends
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Billmain extends Telanganabill {
	
	/*
	 *
	 * Internetbill with no body 
	 * 
	 */

	public void Internetbill(int units){
     //no body
		
	}
	
	public static void main(String[] args) {
		Abstractionandinterface abstractionandinterface;
		abstractionandinterface=new Andhrabill();
		abstractionandinterface.electricitybill(34);
		abstractionandinterface.waterbill(45);
		abstractionandinterface.Internetbill(23);
		
		abstractionandinterface=new Tamilnadubill();
		abstractionandinterface.electricitybill(90);
		abstractionandinterface.Internetbill(89);
		abstractionandinterface.waterbill(78);
		
		
		abstractionandinterface=new Billmain();
		abstractionandinterface.electricitybill(34);
		abstractionandinterface.waterbill(23);
	}

}
