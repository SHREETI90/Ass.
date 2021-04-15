package com.cg.Employee;

public class CalcSalary 
{
	public static void main(String[] args) 
	{
		Emp sales1 = new Emp("Ram",2000);
		
		System.out.println(sales1);
		
		System.out.println("Total Salary ="+Emp.netSal);
		 System.out.println("pf = "+Emp.pf);
		  System.out.println("DA= "+Emp.da);
	}
}
