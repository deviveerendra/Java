package com.ngs.java.stringsstringbuffer;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
*@class   Checkusernameandpassword
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Checkusernameandpassword {
	
	
   /*
    *
    * In this method username and password taken from user,validate the password and check whether the enter details is valid or not
    * 
    */

	public void validation(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username");
		String username= sc.nextLine();
		System.out.println("Enter Password");
		String password=sc.nextLine();
		/*if(username.equals("admin") && password.equals("password123")){
			System.out.println("Login successful");
		 }else{
			 System.out.println("Login failed");
		 } */
		if(username.equals("admin") && passwordvalidation(password)){
		System.out.println("Login successful");
	    }else{
		 System.out.println("Login failed");
		    validation();
		 
	    }
		
	}
	 public static boolean passwordvalidation(String password){
		 
		 // Regex to check valid password.
	        String regex = "^(?=.*[0-9]{2})"
	                       + "(?=.*[a-z])(?=.*[A-Z])"
	                       + "(?=\\S+$).{10,20}$";
	        // Compile the ReGex
	        Pattern p = Pattern.compile(regex);
	          
	        Matcher m = p.matcher(password);
	        return m.matches();
	        
		 
		 
	 }
	 public static void main(String[] args) {
			Checkusernameandpassword checkusernameandpassword = new Checkusernameandpassword();//object is created
			checkusernameandpassword.validation();//calling the method
			
		}

	

}
