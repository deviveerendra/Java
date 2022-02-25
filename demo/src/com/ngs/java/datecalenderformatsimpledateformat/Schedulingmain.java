
package com.ngs.java.datecalenderformatsimpledateformat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

/*
*@class   Schedulingmain
*@version Java "1.8.0_171"
*@author  Deviveerendra
*/


public class Schedulingmain {
	static Date d;
	public static void main(String[] args) { 
		Timer t = new Timer(); //timer is created to schedule a task
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Scheduling scheduling = new Scheduling();
		try {
			 d= df.parse("19/11/2021 12:20:00" );
		} catch (Exception e) {
			e.printStackTrace();
		}
		t.schedule(scheduling, d);//scheduling a task

	}
}
