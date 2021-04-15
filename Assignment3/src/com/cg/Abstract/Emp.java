package com.cg.Abstract;

public abstract class Emp 
{
	private int empId;
	private String ename;
	private double sal;
	
	public Emp(int empId,String ename,double sal)
	{
		super();
		this.empId = empId;
		this.ename = ename;
		this.sal = sal;
	}
	public int getEmpId()
	{
		return empId;
	}
	public String getEname()
	{
		return ename;
	}
	public double getSal()
	{
		return sal;
	}
	public void display()
	{
		System.out.printf("%10%15s%10.2f",empId,ename,sal);
	}
	public abstract double calcSalary();
}
