package com.ngs.java.arrays;

import java.util.Scanner;
/*
*@class   Adding10names
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public class Indexremoving {
	public static String[] add(String[] arr,int index){
	String arr1[]=new String[arr.length-1]; //creating another array 
		for(int j=0,k=0;j<arr.length;j++){
	   /* if (j == index)
		{
		   continue;
		}
          arr1[k++]=arr[j]; */
		if(index!=j)
		{
			 arr1[k++]=arr[j];
		}
          
		}
		return arr1;	
	}
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("enter 10 names");
		String arr[]={"dev","krishna","chaitu","Annaya","sriram","dsp","dp","vinay","hii","bye"};//array is created 
		/*String arr[]=new String[15];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextLine();
		}*/
		System.out.println("ten names are");
		for(int i=0;i<arr.length-1;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println(arr[arr.length-1]);
		
		System.out.println("first name is "+arr[0]);
		System.out.println("fifth name is "+arr[4]);
		System.out.println("ninth name is "+arr[8]);
		arr=add(arr,5); //sends array and index number to add method
		System.out.println("array after removing one of the index");
		for(int i=0;i<arr.length-1;i++){//printing values stored inside an array
			System.out.print(arr[i]+",");
		}
		System.out.println(arr[arr.length-1]);
		
	}

	

}
