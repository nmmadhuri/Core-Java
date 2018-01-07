package com.newjavapackage;

import java.util.Scanner;

public class SumOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=0,sum=0;
		while(num>=0)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			num = sc.nextInt();
			sum = sum+num;
			System.out.println("sum:"+sum);
			
		}
	}

}
