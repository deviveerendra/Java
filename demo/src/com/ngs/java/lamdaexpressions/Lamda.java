package com.ngs.java.lamdaexpressions;

public interface Lamda {
	public void abstractclass();
	
	public static void main(String[] args) {
		Lamda l=()->{
			{
				System.out.println("hii");
				System.out.println("bii");
				// TODO Auto-generated method stub
				
			}
			Thread d =new Thread(()->{
				System.out.println("hii");
				System.out.println("bye");
				
			});
			d.run();
			
		};
		l.abstractclass();
		
		
		
	}

}

