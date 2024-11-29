package ru.mirea.task24.Task2;

public class main
{
	public static void main(String[] args) {
		ChairFactory factory = new ChairFactory();

		FunctionalChair c = factory.createFunctionalChair();

		System.out.println(c.sum(10, 10));
	}
}
