package com.newjavapackage;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RepeatedCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String:");
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		System.out.println("Original String is:" +string);
		Set<Character> hs = new HashSet<>();
		char [] array = string.toCharArray();
		int l= array.length;
		for (int i=0;i<l;i++)
		{
			if(hs.contains(array[i]))
			{
				System.out.println("Repeated character is:" +array[i]);
				
			}
			else
			{
				hs.add(array[i]);
				
			}
		}
		
		System.out.println(hs);
	}

}
