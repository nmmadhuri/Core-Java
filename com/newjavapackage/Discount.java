package com.newjavapackage;

import java.util.Scanner;

public class Discount {
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price of product:");
		double price = sc.nextDouble();
		double discount =5;
		if (price >10)
		{
			price = price - discountCal(price, discount);
		}
		System.out.println("Price after discount:"+price);
	}



 static double discountCal(double price, double discount)
 {
	 
	discount= price*(discount/100);
	return discount;
	
 }
 
	
	
	
	
	
}