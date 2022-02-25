package com.ngs.java.modifiers;
import com.ngs.java.overidinganddynamic.C1;

public class Protected extends C1 {
	
	/*
	 *
	 * Inside main method protected class object is created
	 * 
	 */

	
   public static void main(String[] args) {
	   Protected a= new Protected();
	   a.concrete();
	   a.concrete1();
	
  }

}
