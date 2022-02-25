package com.ngs.java.whiledowhileforloop;

/**
*@class   Whileloop
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public class Whileloop{
	public void pratice(){ //concrete method
		int sum=0;
		int i=0;
		while( i<=100){ //while loop
			sum+=i;
			i++;
		}
		System.out.println("sum is "+sum);
	}
	 public static void main(String args[]){
		  Whileloop whileloop = new Whileloop();//object is created
		  whileloop.pratice(); //method is called

	}

}