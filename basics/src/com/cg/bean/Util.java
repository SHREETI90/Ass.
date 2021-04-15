package com.cg.bean;

public class Util {
		public static final int TWO=2;
		
		public static double round2Dec(double num) 
		{
			double res = Math.round(num*100)/100.0;
			return res;
		}
		public static double round2Dec(double num,int round) 
		{
			double pwr = Math.pow(10,round);
			double res= Math.round(num*pwr)/pwr;
			
			return res;
		}

}

