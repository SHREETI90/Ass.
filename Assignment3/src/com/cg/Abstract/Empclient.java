package com.cg.Abstract;

import com.sun.tools.javac.util.List;

public class Empclient 
{
	public static void main(String[] args) {
		List<Emp> lst = new ArrayList<>();
		lst.add(new Onroll(1001,"ram",230000));
		lst.add(new Onroll(1002,"vikas",430000));
		lst.add(new Onroll(1003,"anil",3000,20));
		lst.add(new Onroll(1004,"samuel",6000,10));
		generateReport(lst);
	}
	public static void generateReport(List<Emp> lst)
	{
		System.out.println("------------------------");
		System.out.printf("%10s%15s%10s%10s%10s%10s%10s%10s\n","EID","ENAME","SAL","DA","PF","DAYS","NSAL","ETYPE");
		System.out.println("-------------------------");
		for(Emp emp:lst)
		{
			emp.display();
		}
	}
}
