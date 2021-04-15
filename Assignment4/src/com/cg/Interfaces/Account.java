package com.cg.Interfaces;

public class Account implements Cdm,Admin
{
	public double balance = 50000;


	public void withdraw()
	{
		System.out.println("withdraw");
	}
	public void getBalance()
	{
		System.out.println("get Balance");
	}
	public void clearPdc()
	{
		System.out.println("Clear PDC");
	}
	public void deposit()
	{
		System.out.println("deposite");
	}
}