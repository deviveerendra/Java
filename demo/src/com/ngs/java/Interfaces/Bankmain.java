package com.ngs.java.Interfaces;
/*
*@class   Bankmain
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Bankmain {
	
	/*
	 *
	 * In main method interface class reference variable holds the implementation class object
	 * 
	 */
	public static void main(String[] args) {
		Interfacebank interfacebank;
		interfacebank=new Sbiclass();
		interfacebank.getInterestRate(4.5d);
	    Sbiclass sbiclass=(Sbiclass)interfacebank;
	    sbiclass.setaccountnumber(20408372116l);
	    System.out.println("Account number is "+sbiclass.getaccountnumber());
	    sbiclass.setmoneyinyouraccount(3000);
	    System.out.println("Money in your account is "+sbiclass.getmoneyinyouraccount());
	    sbiclass.setdeposit(4000);
	    System.out.println("Money in your account after deposite is "+sbiclass.getmoneyinyouraccount1());
	    sbiclass.setwithdrawal(9000);
	    System.out.println("Money in your account is "+sbiclass.getmoneyinyouraccount2());
	    
		interfacebank=new Icici();
		interfacebank.getInterestRate(5.5d);
		Icici icici=(Icici)interfacebank;
		icici.setaccountnumber(45678765334l);
		System.out.println("Account number is "+icici.getaccountnumber());
		icici.setmoneyinyouraccount(4000);
		System.out.println("Money in your account is "+icici.getmoneyinyouraccount());
		icici.setdeposit(5000);
		System.out.println("Money in your account after deposite is "+icici.getmoneyinyouraccount1());
		icici.setwithdrawal(4000);
		System.out.println("Money in your account is "+icici.getmoneyinyouraccount2());
		
		interfacebank=new Hdfcclass();
		interfacebank.getInterestRate(2.2d);
		Hdfcclass hdfc=(Hdfcclass)interfacebank;
		hdfc.setaccountnumber(56437612334l);
		System.out.println("Account number is "+hdfc.getaccountnumber());
		hdfc.setmoneyinyouraccount(9000);
		System.out.println("Money in your account is "+hdfc.getmoneyinyouraccount());
		hdfc.setdeposit(9000);
		System.out.println("Money in your account after deposite is "+hdfc.getmoneyinyouraccount1());
		hdfc.setwithdrawal(6000);
		System.out.println("Money in your account is "+hdfc.getmoneyinyouraccount2());
		
		
	}

}
