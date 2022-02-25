package com.ngs.java.Instancevariablesandmethods;

/*
*@class   Account 
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Account {
	long accountnumber;
	String accountname;
	int balance;
	/*
	 *
	 * setData method will get values by using parameters and assign it to instance variables
	 * 
	 */
	public void setData(long accountnumber,String accountname,int balance){
		this.accountnumber= accountnumber;
		this.accountname= accountname;
		this.balance= balance;
	}
	
	/*
	 *
	 * deposit method will take deposit amount as a parameter adds the value to balance and displays on console
	 * 
	 */
	public void deposit(int depositamount){
		this.balance+= depositamount;
	    System.out.println("Account number is "+accountnumber);
	    System.out.println("Account holder name is "+accountname);
	    System.out.println("Amount after deposited is "+balance);
		
	}
	
	/*
	 *
	 * getbalance method will display the values on console
	 * 
	 */
	public void getbalance(){
		 System.out.println("Account number is "+accountnumber);
		 System.out.println("Account holder name is "+accountname);
		 System.out.println("balance is"+balance);
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
			this.balance-= withdrawalamount;
			System.out.println("balance after withdrawal is"+balance);
		    System.out.println("Account number is "+accountnumber);
			System.out.println("Account holder name is "+accountname);
		}
	}

}
