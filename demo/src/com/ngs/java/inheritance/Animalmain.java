package com.ngs.java.inheritance;

/**
*@class   Animalmain
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Animalmain{
	public static void main(String arg[]){
		Dog dog = new Dog();//object is created and methods are called
		dog.breath();
		dog.eyes();
		dog.legs();
		dog.bark();
		dog.eat();
		Lion lion = new Lion();//object is created and methods are called
		lion.breath();
		lion.eyes();
		lion.legs();
		lion.roar();
		lion.eat();
		Animal animal;
		animal=new Dog();//object is created and methods are called
	    animal.breath();
		animal.eyes();
		animal.legs();
		
		
	}
}