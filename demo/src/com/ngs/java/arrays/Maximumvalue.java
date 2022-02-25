package com.ngs.java.arrays;

import java.util.Scanner;
/*
*@class   Maximumvalue
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Maximumvalue {
	
   /*
    *
    * display Method is to take values from the user
    * 
    */
	 
	 public void display() {
		  Scanner sc = new Scanner (System.in);
		  System.out.println("Enter number of rows: ");
		  int numberofrows = sc.nextInt(); 
		  
		  System.out.println("Enter number of columns: "); 
		  int numberofcolumns = sc.nextInt(); 
		  
		  int[][] matrix = new int [numberofrows][numberofcolumns];
		  
		  System.out.println("Enter matrix numbers: "); 
		   for (int i = 0; i < numberofrows; i++) {
		   System.out.println("Enter numbers for row " + (i+1) ); 
		   for (int j = 0; j < numberofcolumns ; j++) {
		    matrix[i][j] = sc.nextInt();
		  }
		  }
		  // Displaying entered matrix
		  System.out.println(" entered numbers are ");
		  for (int i = 0; i < matrix.length; i++) {
		   System.out.println();
		   for (int j = 0; j < matrix[i].length; j++) {
		     System.out.print(matrix[i][j] + " ");
		    }
		  }
		  System.out.println();
		  int maximum=max(matrix);
		  System.out.println("Maximum number is "+maximum);
		 }
	 
	   /*
	    *
	    * max Method is to find max value in the matrix and return that max value
	    * 
	    */
	
		 public static int max(int[][] a){
		  int maxNum = a[0][0];
		  for (int i = 0; i < a.length; i++) {
		   for (int j = 0; j < a[i].length; j++) {
		    if(maxNum < a[i][j]){
		     maxNum = a[i][j];
		    }
		   }
		  }
		 return maxNum;
		 }
}
