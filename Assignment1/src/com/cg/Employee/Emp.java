package com.cg.Employee;

public class Emp 
{
	public static double pf;
	public static double da;
	public static double netSal;
	public String name;
	public double basicSal;
	
	public Emp(String name, double basicSal)
	{
		this.name = name;
		this.basicSal = basicSal;
		this.name = this.name.toUpperCase();
		
		pf = (0.12*this.basicSal);
		da = (0.4*this.basicSal);
		netSal = (this.basicSal+da)-pf;
	}
	
}
