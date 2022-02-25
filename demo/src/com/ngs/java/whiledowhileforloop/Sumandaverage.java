package com.ngs.java.whiledowhileforloop;

/**
*@class   Sumandaverage
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public class Sumandaverage{

    /*
	 *
	 * This method is used to find sum and average and displays on console
	 * 
     */

    public void sumaverage(){
		int sum=0; 
		double average=0;
		for(int i=1;i<=100;i++)
		{
			sum+=i;
		    average=sum/100d;
		}
		System.out.println("sum of 1 to 100 is "+sum);
	    System.out.println("average of 1 to 100 is "+average);
	}
    public static void main(String args[]){
		  Sumandaverage sumandaverage = new Sumandaverage();//object is created
		  sumandaverage.sumaverage();//method is called
	}

}