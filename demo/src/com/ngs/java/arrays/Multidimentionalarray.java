package com.ngs.java.arrays;
/*
*@class   Multidimentionalarray
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Multidimentionalarray {
	/*
	 *
	 * This method will add two multidimensional arrays and displays on console
	 * 
	 */
	public void display(){
		int[][] arr={{1,2},{2,3},{3,4}};
		int[][] arr1={{2,3},{4,5},{5,6}};
		int[][] arr2=new int[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<2;j++){
				arr2[i][j]=arr[i][j]+arr1[i][j];
				System.out.print(arr2[i][j]+" ");
			}
			    System.out.println();
		}
	}

}
