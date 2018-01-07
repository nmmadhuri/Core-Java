package com.newjavapackage;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //int febCount;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the febCount:");
		  int febCount = sc.nextInt();
		  System.out.println("The febCount is " +febCount);
	      int[] feb = new int[febCount];
	      feb[0] = 0;
	      feb[1] = 1;
	      for(int i=2; i < febCount; i++){
	             feb[i] = feb[i-1] + feb[i-2];
	         }
	 
	      for(int i=0; i< febCount; i++){
	                 System.out.print(feb[i] + " ");
	         }
	}

}
