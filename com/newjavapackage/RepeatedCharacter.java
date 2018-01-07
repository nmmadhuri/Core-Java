package com.newjavapackage;

import java.util.Scanner;

public class RepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the String:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String [] a = str.split("");
		int l = a.length;
		
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(a[i].equals(a[j]))
				{
					System.out.println("Repeated characters are: " +a[i]);
				}
			}
		}
		
		
		

	}

}
