package com.ngs.java.switchstatement;

import java.util.Scanner;
/**
*@class   Printday1
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Printday1{

    /*
	 *
	 *  This method will take input from user to find a day and displays on console by using switch
	 * 
	 */

	public void print1(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int s =sc.nextInt();
        String day="";
		switch(s){
			case 0: day="sunday";
			break;
	        case 1: day="monday";
			break;
			case 2: day="Tueaday";
			break;
			case 3: day="wednesday";
			break;
			case 4: day="Thurday";
			break;
			case 5: day="friday";
			break;
			case 6: day="saturday";
			break;
			default:System.out.println("not a valid day");
			
		}
		System.out.println(day);
	}
	public void print(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int s =sc.nextInt();
		if(s==0){
			System.out.println("Today is sunday");
		}else if(s==1){
			System.out.println("Today is monday");
		}else if(s==2){
			System.out.println("Today is tuesday");
		}else if(s==3){
			System.out.println("Today is wednesday");
		}else if(s==4){
			System.out.println("Today is thursday");
		}else if(s==5){
			System.out.println("Today is friday");
		}else if(s==6){
			System.out.println("Today is saturday");
		}else{
			System.out.println("not a valid day");
		}
	}
	public static void main(String args[]){
		Printday1 printday1 = new Printday1();//creating object
		printday1.print1();//calling the method
		printday1.print();
	}


}
