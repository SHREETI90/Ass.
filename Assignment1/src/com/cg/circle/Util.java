package com.cg.circle;

public class Util 
{
	public static final double PI = 22/7;
	
	public static double round2Dec(double num) 
	{
		double radius = Math.round(num*100)/100.0;
		return radius;
	}
}
