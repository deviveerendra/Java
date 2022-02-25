package com.ngs.java.switchstatement;

import java.util.Scanner;
/**
*@class   Numberofdaysinamonth
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/


public class Numberofdaysinamonth{

    /*
	 *
	 * This method is used to take values from user to display month has how many days
	 * 
	 */

	public void number(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter month");
		String s =sc.nextLine();
		System.out.println("enter year");
		int p =sc.nextInt();
        String month=" ";
		switch(s){
			case "january":month="31";
			break;
	        case "february":if(((p%4==0)&& (p%100!=0))|| (p%400==0)){
			                month="29";
		                   }else{
		                      month="28";
		                   }
			break;
			case "march":month="31"; 
			break;
			case "april":month="30"; 
			break;
			case "may":month="31"; 
			break;
			case "june":month="30"; 
			break;
			case "july":month="31"; 
			break;
			case "august":month="31"; 
			break;
			case "september":month="30"; 
			break;
			case "october":month="31"; 
			break;
			case "november":month="30"; 
			break;
			case "december":month="31"; 
			break;
			
			default:System.out.println("not a valid month");
			
		}
		System.out.println("number of days in a month is "+month);
	}
	public static void main(String args[]){
		Numberofdaysinamonth numberofdaysinamonth = new Numberofdaysinamonth();//creating object
		numberofdaysinamonth.number();//calling method
	}

}
