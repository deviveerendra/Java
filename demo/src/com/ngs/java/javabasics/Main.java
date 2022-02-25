package com.ngs.java.javabasics;

/**
*@class   Appendmain
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public class Main{
	public static void main(String args[]){
		Append append = new Append();//Append class object is created
		append.scanner();//object is created
		
		Helloandmyname helloandmyname = new Helloandmyname();//object is created for Helloandmyname
		helloandmyname.concrete();//method is called
		
		Namecollegeage namecollegeage = new Namecollegeage();//object is created for Namecollegeage class
		namecollegeage.scanner1();//calling the method

	}
}