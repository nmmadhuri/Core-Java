package com.newjavapackage;

import java.util.Scanner;

public class QuadrantEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int a,b,c;
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the value of a:");
           a= sc.nextInt();
           System.out.println("Enter the value of b:");
           b = sc.nextInt();
           System.out.println("Enter the value of c:");
           c= sc.nextInt();
           double val = ((b*b)-(4*a*c));
           System.out.println("Value of val:" +val);
           double semires = Math.sqrt(val);
           if (val>0)
           {
        	   System.out.println("Semires:" +semires);
               double result1 = ((-b+semires)/(4*a*c));
               System.out.println("Value of the root1:" +result1);
               double result2 = ((-b-semires)/(4*a*c));
               System.out.println("Value of the root2:" +result2);
           }
           else
           {
        	   System.out.println("No roots");
           }
           

           
           
		
		
	}

}
