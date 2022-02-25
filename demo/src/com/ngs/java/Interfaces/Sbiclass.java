package com.ngs.java.Interfaces;

/*
*@class   Sbiclass
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Sbiclass implements Interfacebank  {
	private long accountnumber;
	private double moneyinyouraccount;
	
	
	
	
	/*
	 *
	 * setters methods are used here to set the values to private variables and getters methods are used to get the values 
	 * 
	 */


	public void setaccountnumber(long accountnumber){
		this.accountnumber=accountnumber;
	}
	public long getaccountnumber(){
		return accountnumber;
	}
	public void setmoneyinyouraccount(double moneyinyouraccount){
		this.moneyinyouraccount=moneyinyouraccount;
	}
	public double getmoneyinyouraccount(){
		return moneyinyouraccount;
	}
	public void setdeposit(int deposit){
		this.moneyinyouraccount+=deposit;
	}
	public double getmoneyinyouraccount1(){
		return moneyinyouraccount;
	}
	
	
	public void setwithdrawal(int withdrawal){
		if(moneyinyouraccount-withdrawal<0){
			System.out.println("balance is insufficient to withdraw");
		}else{
			this.moneyinyouraccount-=withdrawal;
		}
	}
	public double getmoneyinyouraccount2(){
		return moneyinyouraccount;
	}
	
	/*
	 *
	 * getInterestRate method is used to get the interest rate of Sbi 
	 * 
	 */

	
	public void getInterestRate(double a){
		System.out.println("Interest rate of Sbi is "+a);
		
	}

}

