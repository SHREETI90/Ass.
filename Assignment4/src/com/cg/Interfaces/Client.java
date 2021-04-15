package com.cg.Interfaces;

public class Client 
{
	public static void main(String[] args)
	{
		Account obj = new Account();
		System.out.println(obj.balance);
		obj.withdraw();
		obj.getBalance();
		obj.deposit();
		obj.clearPdc();
	}
}
