package com.ngs.java.whiledowhileforloop;

/**
*@class   Squareboard
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Squareboard{

    /*
	 *
	 * This method is used to print the pattern
	 * 
	 */

	public void pattern(){
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	 public static void main(String args[]){
		  Squareboard squareboard = new Squareboard();//creating object
		  squareboard.pattern();//calling the method
	  }

}