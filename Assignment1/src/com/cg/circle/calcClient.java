package com.cg.circle;

import java.util.Scanner;

public class calcClient 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius");
		double radius = sc.nextDouble();
		
		CircleCnO cir = new CircleCnO();
		cir.radius=radius;
		
		double area = cir.calcArea();
		System.out.println("Area =" + Util.round2Dec(area));
		
		double pm = cir.calcPerimeter();
		System.out.println("Perimeter =" +Util.round2Dec(pm));
		sc.close();
	}	
}
