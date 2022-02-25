package com.ngs.java.differenttypesofclasses;

/*
*@class   Annonymousinnerclassinterfacemain
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public class Annonymousinnerclassinterfacemain{
	public static void main(String[] args) { 
	 Annonymousinnerclassinterface a=new Annonymousinnerclassinterface()
	                   {
						     public void dev(){
						     System.out.println("hii sriram"); //implementing method
					    }
					    };
					    a.dev(); //calling the method
	}
}