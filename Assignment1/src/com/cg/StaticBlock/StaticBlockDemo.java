package com.cg.StaticBlock;

import java.util.ResourceBundle;

import com.cg.circle.CircleCnO;

public class StaticBlockDemo 
{
	public static final String DRIVER;
	public static final String USER;
	static 
	class Cls;
	static
	{
		ResourceBundle rb = ResourceBundle.getBundle("cv");
		DRIVER = rb.getString("driver");
		USER = rb.getString("uname");
		try
		{
			Cls = Class.forName(rb.getString("clsname"));
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args)throws Exception
	{
		System.out.println(DRIVER);
		System.out.println(USER);
		CircleCnO circle = (CircleCnO)Cls.newInstance();
		circle.radius=5;
		System.out.println("Area "+circle.calcArea());
		
	}
	
}
