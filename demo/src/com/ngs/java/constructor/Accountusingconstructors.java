package com.ngs.java.constructor;
/*
*@class   Accountusingconstructors  
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Accountusingconstructors {
	long accountnumber;
	String accountname;
	int balance;
	/*
	 *
	 * Accountusingconstructors is a parameterized constructor and assigns values to instance variables
	 * 
	 */
	Accountusingconstructors(long accountnumber,String accountname,int balance){
		this.accountnumber=accountnumber;
		this.accountname=accountname;
		this.balance=balance;
		
	}
	/*
	 *
	 * deposit method will take deposit amount as a parameter adds the value to balance and displays on console
	 * 
	 */
	public void deposit(int depositammount){
		this.balance+=depositammount;
	    System.out.println("Account number is "+accountnumber);
	    System.out.println("Account holder name is "+accountname);
	    System.out.println("Amount after deposited is "+balance);
		
	}
	/*
	 *
	 * Accountusingconstructors is a constructor used to display values on console
	 * 
	 */
	
	Accountusingconstructors(Accountusingconstructors z){
		 System.out.println("Account number is "+z.accountnumber);
		 System.out.println("Account holder name is "+z.accountname);

		System.out.println("balance is"+z.balance);
	}
	/*
	 *
	 * withdrawal  method will take withdrawal amount as parameter deduce the balance and displays on console
	 * 
	 */
	public void withdrawal(int withdrawalamount){
		if(this.balance-withdrawalamount<0){
			System.out.println("balance is insufficient to withdraw");
		}else{
			this.balance-=withdrawalamount;
			System.out.println("balance after withdrawal is"+balance);
		    System.out.println("Account number is "+accountnumber);
			System.out.println("Account holder name is "+accountname);
		}
	}

}
