package com.ngs.java.datecalenderformatsimpledateformat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
/*
*@class   Slaapplication
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/


public class Slaapplication {
	  public void adding(){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter application received date for credit card sla");
      String date=sc.nextLine();
	  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
	  sdf.setLenient(false);
	  Calendar cal = Calendar.getInstance(); //abstract class 
	  try{
		  cal.setTime(sdf.parse(date));//converting string into date and setting the Calendar time with the given date
		  cal.add(Calendar.DAY_OF_MONTH, 5); 
	      String  adding= sdf.format(cal.getTime());   
	      System.out.println("Your sla date is "+adding); 
		  
	  }catch(Exception e){
		  System.out.println("Please enter correct format ");
	  }
      
	  }

}
