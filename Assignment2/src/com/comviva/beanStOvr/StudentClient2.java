package com.comviva.beanStOvr;

import java.util.Scanner;

public class StudentClient2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student ID");
		int sid = sc.nextInt();
		StudentService ser = new StudentService();
		Student stu = ser.findStudent(branch,2);
		for(Student stu : list)
		{
			System.out.println(stu.getStudentId() + " " + stu.getStuName()
			+ stu.getMarks() + " " + stu.getBranch());
		}
		
	}
}
