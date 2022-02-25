package com.ngs.java.datecalenderformatsimpledateformat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
/**
*@class   Scheduling
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/


public class Scheduling extends TimerTask{//abstract class
	/*
	 *
	 * Inside this method Timer object is created and implicitly called 
	 * 
	 */
	public void run() {
		Date d=new Date();
		Timer t = new Timer(); 
		System.out.println("Task is running ");
		System.out.println("Time is "+d);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
			
		}
		System.out.println("Task is completing.....");
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t.cancel();//discarding any currently scheduled task
		System.out.println("task is completed after scheduled time");
		System.out.println("Time is "+new Date());
		
		
	}

}
