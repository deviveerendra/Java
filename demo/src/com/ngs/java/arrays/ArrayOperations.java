package com.ngs.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
	

	public void arraySizeIncrement(){
		String arr[]={"dev","krishna","chaitu","Annaya","sriram","dsp","dp","vinay","hii","bye"}; //array is created
		System.out.println("Array before resize");
		for(int i=0;i<arr.length-1;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println(arr[arr.length-1]);
		arr=Arrays.copyOf(arr,15); //increasing size of an array 
		arr[10]="chai";
		arr[11]="amma";
		arr[12]="sarojini";
		arr[13]="hello";
		arr[14]="sdde";
		
		System.out.println("Array after resize"); //displaying values
		for(int j=0;j<arr.length-1;j++){
			System.out.print(arr[j]+",");
		}
		System.out.println(arr[arr.length-1]);
		}



	public void readArrayValuesUsingScanner(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 names");
		String arr[]=new String[10]; //creating array
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextLine(); //assigning values to array
			
		}
		System.out.println("Array before resize");
		for(int i=0;i<arr.length-1;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println(arr[arr.length-1]);
		arr=Arrays.copyOf(arr,15); //increasing size of arr array
		System.out.println("Enter remaining names");
		arr[10]=sc.nextLine();
		arr[11]=sc.nextLine();
		arr[12]=sc.nextLine();
		arr[13]=sc.nextLine();
		arr[14]=sc.nextLine();
		
		System.out.println("Array after resize");
		for(int j=0;j<arr.length-1;j++){ //displaying array
			System.out.print(arr[j]+",");
		}
		System.out.println(arr[arr.length-1]);
		}


	public void arrayCopyOperation(){
	int arr[]={1,2,3,4};//creating an array
	int arr1[]=new int[arr.length];//creating another array
	for(int i=0;i<arr.length;i++){
		arr1[i]=arr[i];// Assigning values to second array 
	}
	System.out.println("values of first array");
	for(int i=0;i<arr.length-1;i++){
		System.out.print(arr[i]+",");//display values of first array
	}
	System.out.println(arr[arr.length-1]);
	System.out.println("values of second array");
	for(int j=0;j<arr1.length-1;j++){
		System.out.print(arr[j]+",");//display values of second array
	}
	System.out.println(arr1[arr1.length-1]);
	}
	
	
	public void arrayCopyOperationusingarraycopy(){
		int arr[]={1,2,3,4};//creating an array
		int arr1[]=new int[arr.length];//creating another array
		System.arraycopy(arr, 0, arr1, 0, 4); //copying first array into second array by using arraycopy method
		
		System.out.println("values of first array");
		for(int i=0;i<arr.length-1;i++){
			System.out.print(arr[i]+",");//displays values of first array
		}
		System.out.println(arr[arr.length-1]);
		System.out.println("values of second array");
		for(int j=0;j<arr1.length-1;j++){
			System.out.print(arr[j]+",");//displays values of second array
		}
		System.out.println(arr1[arr1.length-1]);
		}
	
	
	  public void arrayCopyOperationusingclone(){
		int arr[]={1,2,3,4};//array is created
		int arr1[]=arr.clone();//coping of first array into another array using clone method
		System.out.println("values of first array");
		for(int i=0;i<arr.length-1;i++){
			System.out.print(arr[i]+",");//displays first array values
		}
		System.out.println(arr[arr.length-1]);
		System.out.println("values of second array");
		for(int j=0;j<arr1.length-1;j++){
			System.out.print(arr[j]+","); //displays second array values
		}
		System.out.println(arr1[arr1.length-1]);
		}
	  
	  public void arrayCopyOperationusingcopyof(){
			int arr[]={1,2,3,4};//array is created
			int arr1[]=Arrays.copyOf(arr, 4);//coping of first array into another array using copyof method
			System.out.println("values of first array");
			for(int i=0;i<arr.length-1;i++){
				System.out.print(arr[i]+",");//displays first array values
			}
			System.out.println(arr[arr.length-1]);
			System.out.println("values of second array");
			for(int j=0;j<arr1.length-1;j++){
				System.out.print(arr[j]+",");//displays second array values
			}
			System.out.println(arr1[arr1.length-1]);
			}
	  
	  public void arrayCopyOperationusingcopyofRange(){
			int arr[]={1,2,3,4}; //array is created
			int arr1[]=Arrays.copyOfRange(arr, 0, 4);
			
			System.out.println("values of first array");
			for(int i=0;i<arr.length-1;i++){
				System.out.print(arr[i]+",");
			}
			System.out.println(arr[arr.length-1]);
			System.out.println("values of second array");
			for(int j=0;j<arr1.length-1;j++){
				System.out.print(arr[j]+",");
			}
			System.out.println(arr1[arr1.length-1]);
			}





}
