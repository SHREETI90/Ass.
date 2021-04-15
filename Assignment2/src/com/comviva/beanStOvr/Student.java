package com.comviva.beanStOvr;

public class Student 
{
	private int studentId;
	private String stuName;
	private int marks;
	private String branch;
	
	public Student(int studentId, String stuName, int marks, String branch)

	{
		super();
		this.studentId = studentId;
		this.stuName=stuName;
		this.marks = marks;
		this.branch = branch;
	}

	public int getStudentId() {
		return studentId;
	}

	

	public String getStuName() {
		return stuName;
	}

	
	public int getMarks() {
		return marks;
	}

	

	public String getBranch() {
		return branch;
	}

	
	
}
