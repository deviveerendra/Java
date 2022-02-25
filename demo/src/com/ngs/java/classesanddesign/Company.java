package com.ngs.java.classesanddesign;

import java.util.Scanner;
/**
*@class   Company,Innercompany
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public class Company{
	public static void name(String p){
		System.out.println("company name is "+p);//static method
	}
	public static void ceo(String x){
		System.out.println("ceo of the company is "+x);//static method
	}
	public static void chairman(String y){
		System.out.println("chairman of the company is "+y);//static method
	}
	public static void hr(String z){
		System.out.println("hr of the company is "+z);//static method
	}
	public static void investment(long l){
		System.out.println("investment of the company is "+l);//static method
	}
	public static void Employees(int k){
		System.out.println("number of Employees in the company is "+k);//static method
	}
	public static class Innercompany{

           /*
	        *
	        * This method will take details from user
	        * 
	        */
                
    public void scanner(){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter company name");
		String nameofthecompany=sc.nextLine();
		name(nameofthecompany);

		System.out.println("Enter company ceo name");
		String ceoofthecompany=sc.nextLine();
		ceo(ceoofthecompany);

		System.out.println("Enter chairman name");
		String chairmanofthecompany=sc.nextLine();
		chairman(chairmanofthecompany);

		System.out.println("Enter company's hr name");
		String hrofthecompany=sc.nextLine();
		hr(hrofthecompany);

		System.out.println("Enter company's investment");
		long investmentofthecompany=sc.nextInt();
		investment(investmentofthecompany);

		System.out.println("Enter number of Employees in the company");
		int colleguesofthecompany=sc.nextInt();
		Employees(colleguesofthecompany);
		
			
		}
		
		
	}
}