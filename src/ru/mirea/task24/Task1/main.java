package ru.mirea.task24.Task1;

public class main
{
	public static void main(String[] args) {
		ConcreteFactory factory = new ConcreteFactory();
		factory.createComplex();
		factory.createComplex(10, 10);
	}
}
