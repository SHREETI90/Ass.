package com.cg.util;

import java.util.Scanner;

public class CalculateInterest 
{
	public static final int NUMBER=100;
	public static final int ONE=1;
	public static void main(String[] args) 
	{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the Amount");
			double amt = sc.nextDouble();
			System.out.println("Enter the Years");
			int years = sc.nextInt();
			System.out.println("Enter the Rate");
			double rate = sc.nextDouble();
			
			double SI=amt*years*rate / NUMBER;
			double CI=amt*Math.pow((ONE+rate/100), years)-amt;
			
			System.out.println("Simple Interest =" + SI);
			System.out.println("Compound Interest =" + CI);
			sc.close();
	}
}

