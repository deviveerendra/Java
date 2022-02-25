package com.ngs.java.whiledowhileforloop;

import java.util.*;
/**
*@class   Priceoftheitem
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Priceoftheitem{
	Scanner sc=new Scanner(System.in);

    /*
	 *
	 * This method takes input from user to find total cost and displays on console
	 * 
	 */

	public void displaycost(){
		System.out.println("Enter Number of items you have purchased");
		double sum=0;
		int numberofitems=sc.nextInt();
		for(int i=0;i<numberofitems;i++){
			System.out.println("Enter items each price ");
			int item=sc.nextInt();
			sum+=item;
			}
		System.out.println("total cost is "+sum);
		
	}
	 public static void main(String args[]){
		  Priceoftheitem priceoftheitem = new Priceoftheitem();//object is created
		  priceoftheitem.displaycost();//calling method
		 
	  }

	
}