package com.ngs.java.exceptions;

import java.io.IOException;

public class Exceptionalhandlingmain {
	public static void main(String[] args) {
		Exceptionalhandling exceptionalhandling = new Exceptionalhandling();
		//exceptionalhandling.trycatch();
		//exceptionalhandling.trymultiplecatch();
		//exceptionalhandling.Nestedtryblock();
		//exceptionalhandling.trycatchfinally();
		//exceptionalhandling.tryfinally();
		//exceptionalhandling.throw1();
		/*try {
			exceptionalhandling.throws1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//exceptionalhandling.exceptionalpropagation2();
		
		Customexceptions customexceptions = new Customexceptions();
		customexceptions.validation();
	}

}
