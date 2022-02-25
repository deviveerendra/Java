package com.ngs.java.modifiers;

import java.lang.reflect.Method;

/*
*@class   Privatemain
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Privatemain {
	
	/*
	 *
	 * Inside main method newInstance() method object is created and calling the private method outside the class  
	 * 
	 */
	public static void main(String[] args) throws Exception {
		Class c=Class.forName("row30.Private");
		Object o=c.newInstance();
		Method m =c.getDeclaredMethod("dev");  
	    m.setAccessible(true);  
	    m.invoke(o); 
	}

}
