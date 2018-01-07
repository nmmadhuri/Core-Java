package com.newjavapackage;

import java.util.Scanner;

public class WeighingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int LWS,RWS,lws_sum=0,rws_sum=0;
		do
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Left Side Weight:");
			LWS = sc.nextInt();
			System.out.println("Enter the right side weight:");
			RWS = sc.nextInt();
			
			if (LWS != RWS)
			{
				System.out.println("Both the weights are not same");
				lws_sum=lws_sum+LWS;
				rws_sum=rws_sum+RWS;
			}
			else
				System.out.println("Both the weights are same");
			
			
		}while(lws_sum != rws_sum);
	}

}
