package com.cg.Animal;

public abstract class Animal 
{
	public abstract void makeNoise();
}
public class Cat extends Animal
{
	public void makeNoise()
	{
		System.out.println("Cat --> Mew");
	}
}
public class Dog extends Animal
{
	public void makeNoise()
	{
		System.out.println("Dog - Bark");
	}
}
public class Lion extends Animal
{
	public void makeNoise()
	{
		System.out.println("Lion -- roar");
	}
}