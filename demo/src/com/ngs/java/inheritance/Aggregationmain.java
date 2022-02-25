package com.ngs.java.inheritance;

public class Aggregationmain {
	public static void main(String[] args) {
		Aggregation aggregation = new Aggregation("dev",34,21);
		Aggregation aggregation2 = new Aggregation("devi",2,21);
		
		Aggregation1 aggregation1 = new Aggregation1("dev@gmail.com","533294",aggregation);
		Aggregation1 aggregation12 = new Aggregation1("devi@gmail.com","533293",aggregation2);
		aggregation1.display();
		aggregation12.display();
		
	}

}
