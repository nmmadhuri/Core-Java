package com.newjavapackage;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a= sc.nextInt();
		System.out.println("Enter the value of b:");
		int b= sc.nextInt();
		
		sum(a,b);
		sub(a,b);
		mul(a,b);
		div(a,b);
	}

	static int sum(int a, int b)
	{
		int sum = a+b;
		System.out.println("Sum of a and b is:" +sum);
		return sum;
		
	}
	
	static int sub(int a, int b)
	{
		int sub = a-b;
		System.out.println("Difference  of a and b is:" +sub);
		return sub;
	}
	
	static int mul(int a, int b)
	{
		int mul= a*b;
		System.out.println("Product of a and b is:" +mul);
		return mul;
	}
	static double div(int a, int b)
	{
		double div = a/b;
		System.out.println("Division of a and b is:" +div);
		return div;
	}
}
