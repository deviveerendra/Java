package com.ngs.java.Instancevariablesandmethods;
/*
*@class   Accountmain
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Mainclass {
	/*
	 *
	 * main method creates object to Account class ,giving values by using methods and calling that methods by using reference variable
	 * 
	 */
   public static void main(String[] args) {
    Account account = new Account(); //object is created for Account class
    account.setData(20408372116l, "dev", 20000);
	account.deposit(2000);
	account.getbalance();
	account.withdrawal(50000);
	
	
	Arthimeticoperation arthimeticoperation = new Arthimeticoperation();//object is created for Arthimeticoperation class 
	arthimeticoperation.Add(3,5);
	arthimeticoperation.sub(34, 56);
	arthimeticoperation.mul(23, 90);
	arthimeticoperation.div(23, 56);
    
	Student student = new Student(); //object is created for Student class
	student.setData(34, "dev", 34);
	//Student s1=new Student();
	student.displayData();
	Student student2 = new Student();
	student2.setData(23, "krishna", 211);
	student2.displayData();
	
}
   

}