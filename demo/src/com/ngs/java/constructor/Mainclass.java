package com.ngs.java.constructor;
/*
*@class   Accountusingconstructorsmain 
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public class Mainclass {
	
	
	public static void main(String[] args) {
		// created object to Accountusingconstructors ,giving values by using methods and constructors and calling that methods by using reference variable
		Accountusingconstructors accountusingconstructors = new Accountusingconstructors(20408372116l,"dev",3000);
		accountusingconstructors.deposit(10000);
		accountusingconstructors.withdrawal(2000);
		new Accountusingconstructors(accountusingconstructors);
		
		
		//new Arthimeticoperationsusingconstructor(50,60);//object is created to Arthimaticoperationsusingconstructor class
		
		
		/* Employeewithaddress employeewithaddress = new Employeewithaddress();//object is created for Employeewithaddress class
		 employeewithaddress.scanner5();
		 employeewithaddress.updateaddress("hyderabad");*/
		
		 
		/* Noargumentandparameterised noargumentandparameterised = new Noargumentandparameterised(35,"dev",345);//object is created for Noargumentandparameterised class
		 new Noargumentandparameterised(noargumentandparameterised); */
		
		
		
	}
	
	
	
	

}
