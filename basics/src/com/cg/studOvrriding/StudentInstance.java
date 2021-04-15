package com.cg.studOvrriding;

public class StudentInstance 
{
	private int stuId;
	private String sname;
	private int score;
	
	public StudentInstance(int stuId, String sname, int score) 
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
	public boolean equals(Object obj)
	{
		StudentInstance stu = (StudentInstance) obj;
		if(this == stu)
			return true;
		if(this.stuId == stu.stuId)
			return true;
		return false;	
	}
}
