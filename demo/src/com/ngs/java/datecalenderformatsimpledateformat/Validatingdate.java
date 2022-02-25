package com.ngs.java.datecalenderformatsimpledateformat;

import java.util.Date ;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
/*
*@class   Validatingdate
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Validatingdate {
	public static void validate() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date in the format of dd/mm/yyyy");
		String format=sc.nextLine();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
	    DateFormat convert = new SimpleDateFormat("MM/dd/yyyy");
		formatter.setLenient(false);
		try{
			Date a=formatter.parse(format);
			System.out.println("Enterd date is validated "+a);
			format= convert.format(a);
			System.out.println("Entered date is converted "+format);
		}catch(Exception e){
			System.out.println("Entered date is Invalid"+format);
		}
		
		
		
	}


}
