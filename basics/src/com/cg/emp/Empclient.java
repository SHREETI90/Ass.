package com.cg.emp;

public class Empclient 
{
	public static void main(String[] args) 
	{
		Emp emp=new Emp();
		try
		{
			emp.setName("Shreeti");
			emp.setAge(22);
			emp.setSal(6000);
			System.out.println("Name " + emp.getName());
			System.out.println("Age " + emp.getAge());
			System.out.println("Salary " + emp.getSal());
			System.out.println("DA " + emp.getDa());
			System.out.println("PF " + emp.getPf());
			System.out.println("NS " + emp.getNetSal());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
