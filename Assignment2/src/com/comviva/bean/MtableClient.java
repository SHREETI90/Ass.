package com.comviva.bean;

public class MtableClient 
{
	public static void main(String[] args) 
	{
		try {
				Mtable obj = new Mtable(5);
				obj.display(4,7);
			}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
