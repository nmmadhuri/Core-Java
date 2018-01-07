package com.newjavapackage;

import java.util.Scanner;

public class Purchase {
	
	public static void main(String [] args)
	{
		double cookieprice=0.05, cakeprice =0.03;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of cookies:" );
		int cookiesno = sc.nextInt();
		System.out.println("ENter the number of cakes:");
		int cakesno = sc.nextInt();
		double totalprice,discount;
		totalprice = (cookiesno*cookieprice)+(cakesno*cakeprice);
		System.out.println("price :" +totalprice);
		discount = totalprice*(5/100);
		System.out.println("discounted amount: " +discount);
		if (totalprice>10)
		{
			totalprice = totalprice - discount;
			
		}
		System.out.println("The total price of cakes and cookies is:" +totalprice);
		
	}

}
