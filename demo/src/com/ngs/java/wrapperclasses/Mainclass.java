package com.ngs.java.wrapperclasses;

public class Mainclass {
	public static void main(String[] args) {
		Addingtwonumbers addingtwonumbers = new Addingtwonumbers(); //object is created for Addingtwonumbers class
		System.out.println("Sum is "+addingtwonumbers);
		
		Wrapperclass wrapperclass = new Wrapperclass();//object is created for Wrapperclass class
		wrapperclass.wrapper();

}
}