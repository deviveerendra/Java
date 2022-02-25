package com.ngs.java.iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Vehiclemain {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("Tvs",3456);
		Vehicle vehicle1 = new Vehicle("Bajaj",2345);
		try(FileOutputStream fos = new FileOutputStream("readingandwriting\\vehicles.dat")){
			try(ObjectOutputStream obj = new ObjectOutputStream(fos)){
				obj.writeObject(vehicle);
				obj.writeObject(vehicle1);
		}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(FileInputStream fis = new FileInputStream("readingandwriting\\vehicles.dat")){
			try(ObjectInputStream obj = new ObjectInputStream(fis)){
				Vehicle v1 =(Vehicle)obj.readObject();
				Vehicle v2 =(Vehicle)obj.readObject();
				System.out.println("object 1 values for first "+v1);
				System.out.println("object 2 values for second "+v2);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

}
