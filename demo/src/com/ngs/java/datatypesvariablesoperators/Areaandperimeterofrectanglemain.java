package com.ngs.java.datatypesvariablesoperators;
public class Areaandperimeterofrectanglemain{
    /*
	 *
	 * Inside main method object is created by using newInstance method and type casting is done to call the method
	 * 
	 */
	public static void main(String args[]) throws Exception{
		//Areaandperimeterofrectangle q=new Areaandperimeterofrectangle();
        //q.rectangle();
		Class s=Class.forName("Areaandperimeterofrectangle");
		Object o=s.newInstance();
		Areaandperimeterofrectangle q=(Areaandperimeterofrectangle)o;
		q.rectangle();
		
	}
	
}