package com.ngs.java.datecalenderformatsimpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/**
*@class   Twodatescompare
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/


public class Twodatescompare {
	public void compare(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the date in the format of dd/mm/yyyy");
	String format=sc.nextLine();
	System.out.println("Enter another date in the format of dd/mm/yyyy");
	String format1=sc.nextLine();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //simple date format object is created
	sdf.setLenient(false);
	try{
		Date a=sdf.parse(format);
		System.out.println("Entered date is validated "+format);
		Date b=sdf.parse(format1);
		System.out.println("Entered date is validated "+format1);
		
		if(a.compareTo(b) > 0)   //comparing two dates
		{  
		System.out.println("Date 1 comes after Date 2");  
		}   
		else if(a.compareTo(b) < 0)   
		{  
		System.out.println("Date 1 comes before Date 2");  
		}   
		else if(a.compareTo(b) == 0)   
		{  
		System.out.println("Both dates are equal");  
		}  
		
	}catch(Exception e){
		e.printStackTrace();
		System.out.println("Entered date is Invalid "+format);
		System.out.println("Entered date is Invalid "+format1);
	}
	}
	

}
