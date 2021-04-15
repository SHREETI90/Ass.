package com.comviva.beanStOvr;

import java.util.List;

public class StudentService 
{
	private static List<Student> slist = new ArrayList<>();
	static
	{
		slist.add(new Student(1001,"Ram Kumar",90,"ece"));
		slist.add(new Student(1002,"Rajiv Kumar",80,"ece"));
		slist.add(new Student(1004,"Rehan",95,"ece"));
		slist.add(new Student(1005,"Ritesh Kumar",87,"ece"));
		slist.add(new Student(1003,"Rishi Kumar",89,"ece"));
		
		
	}
	public Student findStudent(int sid)
	{
		for (Student stu:slist)
		{
			if(stu.getStudentId()==sid)
				return stu;
		}
		return null;
	}
	public List<Student> findStudent(String branch)
	{
		List<Student> newList = new ArrayList<>();
		for(Student stu : slist)
		{
			if (stu.getBranch().equalsIgnoreCase(branch))
				newList.add(stu);
		
		}
		return newList;
	}
	public List<Student> findStudent(String branch , int limit)
	{
		List<Student> newList = new ArrayList<>();
		int count = 1;
		for(Student stu : slist)
		{
			if (stu.getBranch().equalsIgnoreCase(branch) && count <= limit)
				newList.add(stu);
				++count;
		}
		return newList;
	}
}
