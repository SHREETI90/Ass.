package com.cg.Abstract;

public abstract class Contract extends Emp
{
	private int days;
	
	public Contract(int empId,String ename, double sal,int days)
	{
		super(empId,ename,sal);
		this.days = days;
	}
	public double calcSalary()
	{
		return this.getSal()*days;
	}
	public void display()
	{
		super.display();
		String etype=getClass().getSimpleName();
		System.out.printf("%10s%10s%10d%10.2f%10s\n","--","--",days,calcSalary(),etype);
	}
}
