package com.ngs.java.thissuperkeywords;
/*
*@class   This
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class This {
		int rollno;  
		String name,course;  
		int salary; 
		
		This(int rollno,String name,String course){  //getting values by using this method  
		this.rollno=rollno;  
		this.name=name;  
		this.course=course;  
		} 
		
		This(int rollno,String name,String course,int salary){  
		this(rollno,name,course);   //to assign values to constructor  
		this.salary=salary;  
		} 
		
		void display() //display values
		{
			System.out.println("roll no is "+rollno+ "name is "+name+" course is " +course+" salary is "+salary);
			//System.out.println(this);
		}  
		
		public static void main(String[] args) {
			/*
			 *
			 * In main method This class object is created and assigns values by using constructor and calling the method 
			 * 
			 */
			This this1 =new This(29,"dev","cse",2344);
			this1.display();
			
			
		}


}
