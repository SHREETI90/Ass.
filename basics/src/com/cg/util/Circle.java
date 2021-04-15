package com.cg.util;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius");
		double rad = sc.nextDouble();
		double area = calcArea(rad);
		double pm = calcPerimeter(rad);
		System.out.println("Area =" + area);
		System.out.println("Perimeter =" + pm);
		sc.close();
	}	
	public static double calcArea(double rad) 
	{
		return Math.PI*rad*rad;
	}
	public static double calcPerimeter(double rad)
	{
		return 2*Math.PI*rad;
	}
}
