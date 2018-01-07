package com.newjavapackage;

import java.util.Scanner;

public class Payroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double hoursWorked, payrate,salary;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of  hours worked:");
		hoursWorked = sc.nextDouble();
		System.out.println("Enter the hourly payrate:");
		payrate = sc.nextDouble();
		
		salary = hoursWorked * payrate;
		System.out.println("Salary per month:" +salary);
		
		
		

	}

}
