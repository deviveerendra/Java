package com.ngs.java.polymorphism;
/*
*@class   Student1 
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Student1 {
	String name;
	int age;
	String address;
	
	/*Student1(String name,int age,String address){
		this.name=name;
		this.age=age;
		this.address=address;
		
	}*/
	
	
	/*
	 *
	 * Method overloading
	 * 
	 */
	
	public void setInfo(String name){
		this.name=name;
	}
    public void setInfo(String name,int age){
    	this.name=name;
    	this.age=age;
		
	}
    public void setInfo(String name,int age,String address){
    	
    	this.name=name;
    	this.age=age;
    	this.address=address;
		
   	}

    /*
	 *
	 * display method displays values on console
	 * 
	 */
    
    public void display(){
    	System.out.println("name is "+name+" age is "+age+" address is "+address);
    }
    
    public static void main(String[] args) {
		Student1 student1 = new Student1();
		student1.setInfo("veeru");
		student1.display();
		student1.setInfo("veerendra", 23);
		student1.display();
		student1.setInfo("krishna", 56, "rajahmundry");
		student1.display();
	}



}
