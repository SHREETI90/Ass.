package com.cg.Animal;

import com.sun.tools.javac.util.List;

public class AnimalClient 
{
	public static void main(String[] args) {
		List<Animal> lst = new ArrayList<Animal>();
		lst.add(new Dog());
		lst.add(new Cat());
		lst.add(new Lion());
		displayReport(lst);
	}
	public static void displayReport(List<Animal> alist)
	{
		for(Animal a:alist)
		{
			a.makeNoise();
		}
	}
}
