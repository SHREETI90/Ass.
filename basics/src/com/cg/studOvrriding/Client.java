package com.cg.studOvrriding;

import com.cg.stud.student;

public class Client 
{
	public static void main(String[] args) {
		student stu1 = new student(1001,"Ram",98);
		student stu2 = new student(1002,"Sham",94);
		
		System.out.println("Student 1:"+ stu1);
		System.out.println("Student 2:"+ stu2);
		
		System.out.println(stu1.equals(stu2));
	}
}
