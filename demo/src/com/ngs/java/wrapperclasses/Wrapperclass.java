package com.ngs.java.wrapperclasses;

public class Wrapperclass {
	public void wrapper(){
		byte b=10;
		short s=20;
		int i=30;
		long l=40;
		float f=50.0f;
		double d=60.0d;
		char c='a';
		boolean bo=true;
		
	   /*
	    * 
		*Converting primitives into objects
		*
		*/
		
		Byte byteobj=b;
		Short shortobj=s;
		Integer intobj=i;
		Long longobj=l;
		Float floatobj=f;
		Double doubleobj=d;
		Character charobj=c;
		Boolean booleanobj=bo;
		
		System.out.println("Byte value is "+byteobj);
		System.out.println("Short value is "+shortobj);
		System.out.println("Integer value is "+intobj);
		System.out.println("Long value is "+longobj);
		System.out.println("Float value is "+floatobj);
		System.out.println("Double value is "+doubleobj);
		System.out.println("Character value is "+charobj);
		System.out.println("Boolean value is "+booleanobj);
		
		
		/*
		 * 
	     *Converting objects into primitive
		 *
		 */
		byte by=byteobj;
		short sh=shortobj;
		int  in=intobj;
		long lo=longobj;
		float fl=floatobj;
		double dou=doubleobj;
		char ch=charobj;
		boolean boo=booleanobj;
		
		System.out.println("byte value is "+by);
		System.out.println("short value is "+sh);
		System.out.println("int value is "+in);
		System.out.println("long value is "+lo);
		System.out.println("float value is "+fl);
		System.out.println("double value is "+dou);
		System.out.println("char value is "+ch);
		System.out.println("boolean value is "+boo);
		
	}

}
