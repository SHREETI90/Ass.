package com.cg.bean;

import java.util.Scanner;

import com.cg.util.CgUtil;

public class CalcClient {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Amount");
	double pamt = sc.nextDouble();
	System.out.println("Enter the Years");
	int pyear = sc.nextInt();
	System.out.println("Enter the Rate");
	double prate = sc.nextDouble();
	
	Calculator calc = new Calculator();
	calc.amt=pamt;
	calc.years=pyear;
	calc.rate=prate;
	
	double si = calc.calcSimple();
	double ci = calc.calcComp();
	System.out.println("Simple Interest =" + Util.round2Dec(si));
	System.out.println("Compound Interest =" + Util.round2Dec(ci));
	sc.close();
}
}
