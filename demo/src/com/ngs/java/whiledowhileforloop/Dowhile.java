package com.ngs.java.whiledowhileforloop;

/**
*@class   Dowhile
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public class Dowhile{
    /*
	 *
	 * This method is used to print sum of 1 to 100
	 * 
	 */
	public void pratice1(){
		int sum=0;
		int i=0;
		do{
			sum+=i;
			i++;
			
		}while(i<=100);
		System.out.println("sum is "+sum);
	}
	public static void main(String args[]){
		  Dowhile dowhile = new Dowhile();//object is created 
		  dowhile.pratice1();//calling the method
	}
}