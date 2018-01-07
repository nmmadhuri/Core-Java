package com.newjavapackage;

import java.util.Scanner;

public class RangeSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a= sc.nextInt();
		System.out.println("Enter the value of b:");
		b= sc.nextInt();
		for (int i=a;i<=b;i++)
		{
			System.out.println(i +"   "+i*i);
		}

	}

}
