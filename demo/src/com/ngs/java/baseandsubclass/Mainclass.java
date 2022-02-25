package com.ngs.java.baseandsubclass;
/*
*@class   Baseandsubclassmain
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public class Mainclass {
	/*
	 *
	 * main method creates object to Baseandsubclass, Baseandsubclass1 class ,calling that methods by using reference variable
	 * 
	 */
	public static void main(String[] args) {
		 Baseandsubclass1 baseandsubclass1 = new Baseandsubclass1();
		 baseandsubclass1.print();
		 baseandsubclass1.print1();
		 baseandsubclass1.print2();
		 baseandsubclass1.print3();
		 
		 Baseandsubclass baseandsubclass = new Baseandsubclass();
		 baseandsubclass.print();
		 baseandsubclass.print1();
		 
		 Baseandsubclass baseandsubclass12 = new Baseandsubclass1();
		 baseandsubclass12.print();
		 baseandsubclass12.print1();
		 
		 Baseandsubclass1 Baseandsubclass1= (Baseandsubclass1)baseandsubclass12;
		 Baseandsubclass1.print();
		 Baseandsubclass1.print1();
		 Baseandsubclass1.print2();
		 Baseandsubclass1.print3();
		 
		 Employee employee = new Employee(22.5,1998,"ESPD1199");//object is created for Employee
	     employee.print();
	}
	
	 

}
