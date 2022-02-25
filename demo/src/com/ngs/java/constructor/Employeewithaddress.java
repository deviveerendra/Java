package com.ngs.java.constructor;
import java.util.Scanner;
/*
*@class   Employeewithaddress  
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/


public class Employeewithaddress {
	String address;
	/*
	 *
	 * scanner5 method will take values from user and displays on console
	 * 
	 */
	public void scanner5(){
		String proceed="yes";
		while((proceed.equals("yes"))|| (proceed.equals("Yes")))
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.nextLine();
		System.out.println("enter age");
		int age=sc.nextInt();
		System.out.println("enter salary");
		int salary=sc.nextInt();
		System.out.println("enter designation");
		String designation=sc.nextLine();
		sc.nextLine();
		System.out.println("enter address");
		address=sc.nextLine();
		System.out.println("name is "+name+" ,age is "+age+" ,salary is "+salary+",designation is "+designation+ ",address is "+address );
		System.out.println("enter yes to proceed and enter no to exit");
		proceed=sc.next();
		}
	}
	/*
	 *
	 * updateaddress method takes address as parameter to update the address and displays the updated address on console 
	 * 
	 */
	  public void updateaddress(String address){
		this.address=address;
		System.out.println("address after update is "+address);
		
	}

}
