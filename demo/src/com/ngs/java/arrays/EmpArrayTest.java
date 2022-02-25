package com.ngs.java.arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmpArrayTest {
	public static void main(String[] args) {

		EmpArrayTest empArrayTest = new EmpArrayTest();
		// TODO Auto-generated method stub
		System.out.println("How many Employess data you want to store");

		Scanner scanner= new Scanner(System.in);
		int empCount=scanner.nextInt(); // 5

		Employee [] empArray=new Employee[empCount];

		for(int empVar=0;empVar<empCount;empVar++){ //0 1 2 3 4 5

            empArray[empVar]= empArrayTest.readEmpDetails(empVar);
		}

		for(int empVar=0;empVar<empCount;empVar++){ //0 1 2 3 4 5
		Employee employeeRead=empArray[empVar];


		System.out.println(employeeRead.getEmpName()+" "+employeeRead.getAge()+" "+employeeRead.getSalary()+" "+employeeRead.getDesignation());

		//empArray[empVar]= empArrayTest.readEmpDetails();
		}


		}




		public Employee readEmpDetails(int empVar){

		Employee employee= new Employee();

		Scanner scanner= new Scanner(System.in);
		try{
		System.out.println("Please enter Employee Name for employee : "+empVar);
		String empName=scanner.next();

		employee.setEmpName(empName);

		System.out.println("Please enter Employee age for employee : "+empVar);
		int age=scanner.nextInt();

		employee.setAge(age);

		System.out.println("Please enter Employee Designation for employee : "+empVar);
		String designation = scanner.next();
		employee.setDesignation(designation);

		System.out.println("Please enter Employee Salary for employee : "+empVar);
		float salary = scanner.nextFloat();

		employee.setSalary(salary);
		}catch (InputMismatchException inputMismatchException) {
		System.out.println("Please enter correct type of value");
		//inputMismatchException.printStackTrace();

		}catch (Exception e) {
		e.printStackTrace();
		}
		return employee;
		}



}
