package com.ngs.java.arrays;
import java.util.Scanner;
/*
*@class   Employee1
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class DisplayEmployeedetails {
	
	/*
	 *
	 * This method will take input from user and displays on console
	 * 
	 */
	
	public void scanner(){
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no. of Employee details you want to enter ");
		int n=sc.nextInt();
		String arr[]= new String[4];//array is created
		for(int i=0;i<n;i++){
			System.out.println("Enter employee name");
		    sc.nextLine();
		    arr[0]= sc.nextLine();
			System.out.println("Enter age");
			arr[1]= Integer.toString(sc.nextInt());
			sc.nextLine();
			System.out.println("Enter designation");
			arr[2]= sc.nextLine();
			System.out.println("Enter Salary");
			arr[3]= Integer.toString(sc.nextInt());
			System.out.println("Name of employee is "+arr[0]+" Salary is "+arr[3]);
            
		}
	}
}
