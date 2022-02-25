package com.ngs.java.stringsstringbuffer;
/*
*@class   String
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public class Strings {
	/*
	 *
	 * Inside this method String object is created by using String Literal and new keyword
	 * 
	 */
	public void string(){
	String s1="dev";  //String Literal
	String s2=new String("dev"); 
	if(s1.equals(s2)){
		System.out.println("true");
	}else{
		System.out.println("false");
	}
	
	if(s1==s2){
		System.out.println("true");
	}else{
		System.out.println("false");
	}
	}
	
	public static void main(String[] args) {
		Strings strings = new Strings();//object is created
		strings.string();//method is called 
	}


}
