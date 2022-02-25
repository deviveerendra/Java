package com.ngs.java.controlstatements;

import java.util.Scanner;
/**
*@class   Average
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public class Average{

    /*
	 *
	 * This method will take marks as an input and displays the grade based on marks
	 * 
	 */

	    public void markscheck(){
	        Scanner sc=new Scanner(System.in);
		    System.out.println("enter maths marks");
		    int a=sc.nextInt();
		    if((a<0) || (a>100)){
			System.out.println("enter valid marks of maths");
			a=sc.nextInt();
		    }
		 
		    System.out.println("enter physics marks");
		    int b=sc.nextInt();
		    if((b<0) || (b>100)){
			System.out.println("enter valid marks of physics");
			 b=sc.nextInt();
		    }
		 
		    System.out.println("enter chemistry marks");
		    int c=sc.nextInt();
		    if((c<0) || (c>100)){
			System.out.println("enter valid marks of chemistry");
			c=sc.nextInt();
		   }
		    int ave=(a+b+c)/3;
		    if(ave>=90 && ave<=100){
			System.out.println("your grade is A");
			 
		   }else if(ave>=70 && ave<90){
			 System.out.println("your grade is B");
		   }else if(ave>=50 && ave<70){
			 System.out.println("your grade is C");
		   }else{
			 System.out.println("your grade is D");
		 }
		 
		 
		 
		}
	
}