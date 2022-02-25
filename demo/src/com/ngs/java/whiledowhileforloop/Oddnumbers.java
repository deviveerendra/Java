package com.ngs.java.whiledowhileforloop;

/**
*@class   Multidimentionalarray
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Oddnumbers{
    /*
	 *
	 * This method is used to display odd numbers upto 100 on console
	 * 
	 */

	public void oddnumber(){
		for(int i=1;i<=100;i++){
			if(i%2==0){
				continue;
			}
			System.out.println("odd numbers are "+i);
			
		}
	}
	 public static void main(String args[]){
		  Oddnumbers oddnumbers = new Oddnumbers();//creating object
		  oddnumbers.oddnumber();//calling method
	  }

}