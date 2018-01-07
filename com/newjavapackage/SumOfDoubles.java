package com.newjavapackage;

import java.util.Scanner;

public class SumOfDoubles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num=0, sum=0;
		while(num>=0)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number:");
			num = sc.nextDouble();
			sum = sum + num;
			System.out.println("Sum:" +sum);
			
		}

	}

}
