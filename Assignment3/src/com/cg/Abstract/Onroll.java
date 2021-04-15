package com.cg.Abstract;

public abstract class Onroll extends Emp 
{
	private double pf;
	private double da;
	
	public Onroll(int empId,String ename, double sal,int days)
	{
		super(empId,ename,sal);
		pf=this.getSal()*0.12;
		da=this.getSal()*0.4;
	}
	public double calcSalary()
	{
		return this.getSal() + da-pf;
	}
	public void display()
	{
		super.display();
		String etype = getClass().getSimpleName();
		System.out.printf("%10.2f%10.2f%10s%10.2f%10s\n",da,pf,"--",calcSalary(),etype);
	}
}
