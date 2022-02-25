package com.ngs.java.arrays;
/*
*@class   Displaying1to20
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/


public class Display1to20values {
	/*
	 *
	 * Inside Display method array is created and displayed the 1 to 20 values on console
	 * 
	 */
	public void display(){
		int j=0;
		int arr[]=new int[20];
		for( int i=0;i<arr.length;i++){
			arr[i]=++j;
			if(arr[i]==20){
				System.out.print(arr[i] );
			}else{
				System.out.print(arr[i] + ",");
			}
			
			
		}
	   
		
		
		
	}

}
