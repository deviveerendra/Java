package com.ngs.java.exceptions;

import java.util.Scanner;

public class Customexceptions {

		public void validation(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username");
		String username= sc.nextLine();
		System.out.println("Enter Password");
		String password=sc.nextLine();
		if(username.equals("admin") && password.equals("password123")){
			System.out.println("Login successful");
		 }else{
			 try {
				throw new Exception("Enter valid credentials");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		 } 
	}


}
