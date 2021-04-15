package com.cg.Sales;

public class SalesClient 
{
	public static void main(String[] args) 
	{
		Sales sales1 = new Sales("Ram",20000);
		Sales sales2 = new Sales("Tom",40000);
		Sales sales3 = new Sales("Sam",10000);
		System.out.println(sales1);
		System.out.println(sales2);
		System.out.println(sales3);
		System.out.println("Count ="+Sales.count);
		System.out.println("Total Sales ="+Sales.tot);
	}
}
