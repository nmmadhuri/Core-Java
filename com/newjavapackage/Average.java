package com.newjavapackage;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sub1,sub2,sub3,sub4,sub5,sub6;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks in subject 1:");
		sub1 = sc.nextInt();
		System.out.println("Enter the marks in subject 2:");
		sub2 = sc.nextInt();
		System.out.println("Enter the marks in subject 3:");
		sub3 = sc.nextInt();
		System.out.println("Enter the marks in subject 4:");
		sub4 = sc.nextInt();
		System.out.println("Enter the marks in subject 5:");
		sub5 = sc.nextInt();
		System.out.println("Enter the marks in subject 6:");
		sub6 = sc.nextInt();
		
		double average;
		average = (sub1+sub2+sub3+sub4+sub5+sub6)/6;
		
		System.out.println("Average of student is:" +average);
		

	}

}
