package com.cg.bean;

public class Calculator {
	public double amt;
	public int years;
	public double rate;
	
	public Calculator()
	{
		
	}
	public double calcSimple() {
		return amt*years*rate / 100;
	}
	public double calcComp()
	{
		return amt*Math.pow((1+rate/100), years)-amt;
	}
}
