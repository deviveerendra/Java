package com.ngs.java.controlstatements;

/**
*@class   Averagemain
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/
public class Mainclass{
	public static void main(String args[]){
	  Average average = new Average();//object is created for Average class
	  average.markscheck(); //method is called
	  
	  Elegibilevote elegibilevote = new Elegibilevote();//object is created for Elegibilevote class
	  elegibilevote.eighteen();//calling the method
	  
	  Evenandodd evenandodd = new Evenandodd();//object is created for Evenandoddclass
	  evenandodd.checknumber();//calling the method
	  
	  Greaternumber greaternumber = new Greaternumber();//object is created for Greaternumber
	  greaternumber.greater();
	  
	  Leapyearornot leapyearornot = new Leapyearornot();//object is created for Leapyearornot class
	  leapyearornot.leapornot();//calling methods

	  Positiveandnegitive positiveandnegitive = new Positiveandnegitive();//object is created for Positiveandnegitive class
	  positiveandnegitive.number();//calling the method
	  
	  Vowelsandconsonents vowelsandconsonents = new Vowelsandconsonents();//object is created for Vowelsandconsonents class
	  vowelsandconsonents.vowelsorconsonents();//method is called



	}
}