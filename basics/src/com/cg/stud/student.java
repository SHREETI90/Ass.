package com.cg.stud;

public class student 
{
	private int stuId;
	private String sname;
	private int score;
	
	public student(int stuId, String sname, int score) 
	{
		super();
		this.stuId = stuId;
		this.sname = sname;
		this.score = score;
	}
	public String toString()
	{
		return stuId + " " + sname + " " + score;
	
	}
	
}
