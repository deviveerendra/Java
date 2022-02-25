package com.ngs.java.classesanddesign;

import com.ngs.java.classesanddesign.Company.Innercompany;

/**
*@class   Companymain
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public class Companymain{
        
	public static void main(String[] args) { 
	 Innercompany innercompany = new Company.Innercompany();//creating object of inner class
	 innercompany.scanner();//calling the method
	}
}