package com.ngs.java.stringsstringbuffer;
import java.util.Scanner;
public class Takinginputfromuser {
	
	
	public void scanner(){
		Scanner sc=new Scanner(System.in);
		StringBuffer buffer=new StringBuffer();
		System.out.println("Enter first name");
		String firstname= sc.nextLine().toUpperCase();
		if(firstname.isEmpty()){
			System.out.println(buffer.insert(0,"First name cannot be empty"));
			System.out.println("Enter First name");
			firstname=sc.nextLine().toUpperCase();
			buffer.delete(0, buffer.length());
		}
		System.out.println("Enter last name");
		String lastname= sc.nextLine().toUpperCase();
		if(lastname.isEmpty()){
			System.out.println(buffer.insert(0,"Last name cannot be empty"));
			System.out.println("Enter Last name");
			lastname=sc.nextLine().toUpperCase();
			buffer.delete(0, buffer.length());
		}
		System.out.println("Enter Email");
		String email= sc.nextLine();
		if(email.matches(( "^(.+)@(.+)$"))){
			System.out.println("Entered email is correct");
		}else{
			System.out.println(buffer.insert(0, "Enter valid email"));
			email=sc.nextLine();
			buffer.delete(0, buffer.length());
		}
		System.out.println("Enter DOB");
		String dob= sc.nextLine();
		if(dob.matches( "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$")){
			System.out.println("Entered dob is in valid form");
			
		}else{
			System.out.println(buffer.insert(0, "Enter valid dob \"dd/mm/yyyy\" "));
			dob=sc.nextLine();
			buffer.delete(0, buffer.length());
		}
		System.out.println("Enter gender");
		String gender= sc.nextLine();
		if(gender.isEmpty()){
			System.out.println(buffer.insert(0," Gender cannot be empty"));
			System.out.println("Enter Gender");
			lastname=sc.nextLine();
			buffer.delete(0, buffer.length());
		}
		System.out.println("Enter Marial status");
		String marialstatus= sc.nextLine();
		System.out.println("Enter phone number");
		String phonenumber= sc.nextLine();
		if(phonenumber.matches("^\\d{10}$")){
			System.out.println("Entered phone number is valid");
		}else{
			System.out.println(buffer.insert(0, "Enter valid number"));
			phonenumber=sc.nextLine();
			buffer.delete(0, buffer.length());
		}
		System.out.println("Enter pincode");
		String pincode= sc.nextLine();
		if(pincode.matches("^\\d{6}$")){
		   System.out.println("Entered pincode is valid");
		}else{
			System.out.println(buffer.insert(0, "Enter valid pincode"));
			phonenumber=sc.nextLine();
			buffer.delete(0, buffer.length());
		}
		System.out.println("Credit card details are validated");
		System.out.println("Credit card details are "+"\n" +"Name is "+firstname +lastname+"\n"+"Email is "+email+"\n"+"dob is "+dob+"\n"+"Phone number is "+phonenumber);
	}
	public static void main(String[] args) {
		Takinginputfromuser takinginputfromuser = new Takinginputfromuser();
		takinginputfromuser.scanner();
	}

	

}
