package com.ngs.java.exceptions;

import java.io.IOException;
import java.util.Scanner;
/**
*@class   Exceptionalhandling
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/


public class Exceptionalhandling {
	int a,b;
	Scanner sc=new Scanner(System.in);
	public void trycatch(){
		System.out.println("Enter first number");
		a=sc.nextInt();
		System.out.println("Enter second number");
		b=sc.nextInt();
		try{
		System.out.println(a/b); //exception occurs here
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Hii");
		
	}
	
	 public void trymultiplecatch(){
		 System.out.println("Enter first number");
			a=sc.nextInt();
			System.out.println("Enter second number");
			b=sc.nextInt();
			try{
			    System.out.println(a/b); //exception occurs here
			}catch(ArrayIndexOutOfBoundsException e){
				e.printStackTrace();
			}catch(ArithmeticException e){
				e.printStackTrace();
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("Hii");
		 }
	 
	   public void Nestedtryblock(){
		   try{
			   
			   try{
				   
				   try{
					   int arr[]={1,2,3,4};
					   System.out.println(arr[10]);
					   
				   }catch(ArithmeticException e){
					   e.printStackTrace();
				   }
				   
			   }catch(NullPointerException e){
				   e.printStackTrace();
			   }
		   }catch(ArrayIndexOutOfBoundsException e){
			   e.printStackTrace();
			   
		   }
		   System.out.println("hii");
		  
	  }
	   public void trycatchfinally(){
			    System.out.println("Enter first number");
				a=sc.nextInt();
				System.out.println("Enter second number");
				b=sc.nextInt();
				try{
				System.out.println(a/b); //exception occurs here
				}catch(Exception e){
					e.printStackTrace();
				}finally{
					System.out.println("finally block is executed");
				}
				System.out.println("Hii");
	   }
	   
	   
	   public void tryfinally(){
		   try{    
			    int data=25/5;    
			    System.out.println(data);    
			   }     
			catch(NullPointerException e){  
			    System.out.println(e);  
			 }    
			 
			finally {  //executed regardless of exception occurred or not  
			 System.out.println("finally block is always executed");  
			 }    
			     
			 System.out.println("rest of the code execute");    
			}    
	   
	   public void throw1(){
		    System.out.println("Enter first number");
			a=sc.nextInt();
			System.out.println("Enter second number");
			b=sc.nextInt();
			if(b==0){
				throw new ArithmeticException("please give valid b value ");
				
			}else{
				int c=a/b;
				System.out.println(c);
			}
			System.out.println("hii");

		   
	   }
	   public void throws1() throws IOException{
		   throw new IOException("ioexception");
		   
	   }
	   public void exceptionalpropagation(){
		   int a=24/0;
		 }
	   public void exceptionalpropagation1(){
		   exceptionalpropagation();
	   }
	   public void exceptionalpropagation2(){
		   exceptionalpropagation1();
	   }

}
