package com.ngs.java.methods;
import java.lang.Math.*;
/**
*@class   Circle
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Circle{

	float r=4.5f;
    /*
	 *
	 * This method is used to find the Area and Perimeter of a circle
	 * 
	 */
	public void areaperimeter(){
	  System.out.println("Perimeter of a circle is "+(2*Math.PI*r));
	  System.out.println("Area of a circle is "+(Math.PI*r*r));
	
		
	}
}