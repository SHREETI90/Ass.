package com.cg.studFinalize;

public class StudentF 
{
	private int stuId;
	private String sname;
	private int score;
	
	public StudentF(int stuId, String sname, int score) 
	{
		super();
		this.stuId = stuId;
		this.sname = sname;
		this.score = score;
	}
	public String toString()
	{
		return stuId + " " +sname + " " + score;
	}
	protected void finalize() throws Throwable
	{
		System.out.println("Garbage collected the student" + stuId);
	}
}
