package com.cg.studFinalize;

import com.cg.stud.student;
import java.util.Scanner;

public class FinalizeDemo 
{
	public static void main(String[] args) {
		student stu1 = new student(1001,"Ram",98);
		student stu2 = new student(1002,"Sham",94);
		student stu3 = new student(1003,"xyz",88);
		stu2=null;
		stu3=null;
		System.gc();
		System.out.println("Press any key to exit");
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt();
	}
}
