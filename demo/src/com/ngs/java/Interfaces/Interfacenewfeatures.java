package com.ngs.java.Interfaces;
/*
*@interface   interfacenewfeatures
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public interface Interfacenewfeatures {
	public void hii();//abstract method
	default void method(){
		System.out.println("this is defalut method"); //default methods in interface
	}
	public static void method1(){
		System.out.println("this is static method"); //static methods in interface
	}
	

}
