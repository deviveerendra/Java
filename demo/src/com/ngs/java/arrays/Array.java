package com.ngs.java.arrays;

import java.util.Scanner;

/**
*@class   array
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
 
public class Array {
	int n;
	/*
	 *
	 * scanner method will take values from user and sort them in assending order 
	 * 
	 */

	public void scanner(){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter number of elements you want in array");
	 n=sc.nextInt();
	 int arr[]=new int[n];//array is created of size n
	 System.out.println("enter all the elements you want to sort");
	 for(int i=0;i<n;i++)
	 {
		arr[i]=sc.nextInt();//giving values to array
	 }
	 for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++){
			if(arr[i]>arr[j]){
				int swap=arr[i];
				arr[i]=arr[j];
				arr[j]=swap;
			}
		}
	}
	System.out.println("Assending order is");
	for(int i=0;i<arr.length-1;i++){
		System.out.print(arr[i] + ",");
		
	}
	System.out.println(arr[arr.length-1]);
	
	for(int i=0;i<arr.length;i++){
		if(arr[i]%2==0){
			System.out.println("entered number " +arr[i] +" is even number");
		}
		else{
			System.out.println("entered number " +arr[i] +" is odd number");
		}
		
	}
	
	}
	
	

}
