package com.ngs.java.iostreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Writingandreadingafile {
	public static void main(String[] args) {
		File fw = new File("readingandwriting");
		fw.mkdir();
		fw = new File("readingandwriting//dev.txt");
		
		/*try {
		
			fw.createNewFile();
			System.out.println("File is created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error while creating file");
		}*/
		try(BufferedWriter bw=new BufferedWriter(new FileWriter(fw,true))){
			bw.write("dev");
			bw.newLine();
			bw.write("krishna");
			bw.newLine();
			bw.write("chaitu");
			bw.newLine();
			bw.write("sriram");
			bw.newLine();
			bw.write("lakshmi");
			bw.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			BufferedReader br = new BufferedReader(new FileReader("readingandwriting//dev.txt"));
			String line;
			while((line=br.readLine())!=null){
				System.out.println(line);
				br.close();
			}
			
		}catch(FileNotFoundException e){
			System.out.println("File is not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
