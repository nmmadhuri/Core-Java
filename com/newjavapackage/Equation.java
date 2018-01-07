package com.newjavapackage;

import java.util.Scanner;

public class Equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of x:");
		int x = sc.nextInt();
		int result = 3*x*x - 8*x +4;
		System.out.println("The value of the equation is: " +result);
		

	}

}
