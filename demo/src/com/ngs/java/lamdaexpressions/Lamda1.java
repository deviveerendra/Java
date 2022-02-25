package com.ngs.java.lamdaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lamda1 {
	private String name;

	public Lamda1(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "list of [names=" + name + "]";
	}
	public static void main(String[] args) {
		List<Lamda1> list =new ArrayList<>();
		list.add(new Lamda1("dev"));
		list.add(new Lamda1("veeru"));
		list.add(new Lamda1("krishna"));
		Collections.sort(list, (Lamda1 o1, Lamda1 o2)->{
			return o1.getName().compareTo(o2.getName()); 
			
				
		});
		for(Lamda1 data:list){
			System.out.println(data);
			
		}
	}
		
		
	}
	

	

