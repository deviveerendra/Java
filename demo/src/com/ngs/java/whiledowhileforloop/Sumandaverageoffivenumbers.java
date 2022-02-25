package com.ngs.java.whiledowhileforloop;

import java.util.*;
/**
*@class   Sumandaverageoffivenumbers
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Sumandaverageoffivenumbers{
    /*
	 *
	 * This method will take input from user and do sum and average and displays result on console
	 * 
	 */
	public void giveusernumbers(){
		Scanner sc=new Scanner(System.in);
                String proceed="yes";
		
		while((proceed.equals("yes"))|| (proceed.equals("Yes"))) //while loop asks user to proceed or not
		{
		  int sum=0;
		  double average=0;
		  System.out.println("Enter first number");
		  int a=sc.nextInt();  
		  System.out.println("Enter second number");
		  int b=sc.nextInt();
		  System.out.println("Enter third number");
		  int c=sc.nextInt();
		  System.out.println("Enter fourth number");
		  int d=sc.nextInt();
		  System.out.println("Enter fifth number");
		  int e=sc.nextInt();
		  sum=a + b + c + d + e;
		  average=sum/5f;
		  System.out.println("sum is "+sum);
		  System.out.println("average is "+average);
		  System.out.println("enter yes to proceed or no to exit");
		  proceed=sc.next();
		//quit=sc.nextLine();
		}
		
		}
	public static void main(String args[]){
		  Sumandaverageoffivenumbers sumandaverageoffivenumbers = new Sumandaverageoffivenumbers();//object is created
		  sumandaverageoffivenumbers.giveusernumbers();//method is called
		 
	  }


}
		
		
