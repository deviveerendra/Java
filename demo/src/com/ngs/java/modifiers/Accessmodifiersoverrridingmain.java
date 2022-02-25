package com.ngs.java.modifiers;
/*
*@class   Accessmodifiersoverridingmain
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/

public class Accessmodifiersoverrridingmain extends Accessmodifiersoverriding{
	 
	   public void dev(){     //restriction order of overidden method is private>default>protected>public
		System.out.println("bye"); //overridden method must not be more restrictive
	}
       public static void main(String[] args) {
    	 Accessmodifiersoverrridingmain accessmodifiersoverrridingmain = new Accessmodifiersoverrridingmain();
    	 accessmodifiersoverrridingmain.dev();
	
    }
}
