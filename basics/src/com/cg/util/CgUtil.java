package com.cg.util;

import java.util.Scanner;

public class CgUtil 
{
	public static final int TWO=2;
	public static double round2Dec(double radius) 
	{
		double res = Math.round(radius*100)/100.0;
		return res;
	}
public static void main(String[] args)
{
	System.out.println("Main Starts");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the radius");
	double rad = sc.nextDouble();
	double area = calcArea(rad);
	double pm = calcPerimeter(rad);
	System.out.println("Perimeter =" + CgUtil.round2Dec(pm));
	System.out.println("Area =" + CgUtil.round2Dec(area));
	sc.close();
}	
public static double calcPerimeter(double rad) 
{
	double pm=CgUtil.TWO * Math.PI*rad;
	return pm;
}
public static double calcArea(double rad) 
{
	double pm=Math.PI*rad*rad;
	return pm;
}
}	
