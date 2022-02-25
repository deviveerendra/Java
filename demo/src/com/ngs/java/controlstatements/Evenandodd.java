package com.ngs.java.controlstatements;

import java.util.Scanner;
/**
*@class   Evenandodd
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public class Evenandodd{
    /*
	 *
	 * This method will take input from user to check the number is even or not
	 * 
	 */
  public void checknumber(){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int s=sc.nextInt();
	if(s%2==0){
		System.out.println("entered number "+s+" is evennumber");
	}else{
		System.out.println("entered number "+s +" is oddnumber");
		
	}
     
  }
}