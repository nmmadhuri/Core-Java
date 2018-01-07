package com.newjavapackage;

import java.util.Scanner;

public class DiscountCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price of the product:" );
		double price = sc.nextDouble(); //To accept input from the console
		double discount =5;
		discount = price*(discount/100);
		System.out.println("Discount for this product is: " +discount);
		
	}

}
