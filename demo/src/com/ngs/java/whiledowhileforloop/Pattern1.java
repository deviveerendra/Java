package com.ngs.java.whiledowhileforloop;

/**
*@class   Pattern1
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public class Pattern1{
	
    /*
	 *
	 * This method used to create pattern and displays on console
	 * 
	 */
        
	public void pattern(){
		for(int i=0;i<5;i++){
			for(int j=0;j<=i;j++){
				System.out.print("#");
			}
			System.out.println();
		}
	}
	public void pattern1(){
		 int odd=1;
		  for (int i=1; i<=5; i++)
	        {
	 
	            for (int j=5-i; j>=i; j--)
	            {
	                System.out.print(" ");
	            }
	  
	            for (int k=1; k<=odd; k++ )
	            {
	               System.out.print(i+" ");
	                
	            }
	 
	            System.out.println();
	            odd=odd+2;
	        }




	}
	public static void main(String args[]){
		  Pattern1 pattern1 = new Pattern1();//creating object
		 // pattern1.pattern();//calling the method
		  pattern1.pattern1();
	  }

}