package com.comviva.bean;

public class Mtable 
{
	private int num;
	
	public Mtable(int num)throws Exception 
	{
		super();
		if(num<=0) throw new Exception("number must be greater has zero");
		this.num = num;
	}
	public void display()
	{
		for(int i=1;i<=10;++i)
			System.out.printf("%d * %d = %d\n" , num, i , num*i);
	}
	public void display(int rows)
	{
		for(int i=1;i<=rows;++i)
			System.out.printf("%d * %d = %d\n" ,  num, i ,num*i);
	}
	public void display(int start,int end)
	{
		for(int i=1;i<=end;++i)
			System.out.printf("%d * %d = %d\n" ,  num,i , num*i);
	}
}