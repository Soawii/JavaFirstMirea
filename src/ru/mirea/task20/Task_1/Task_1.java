package ru.mirea.task20.Task_1;

import java.io.Serializable;

public class Task_1<T extends Comparable, V extends Serializable, K extends Animal>
{
	public T var1;
	public V var2;
	public K var3;

	Task_1(T var1, V var2, K var3)
	{
		this.var1 = var1;
		this.var2 = var2;
		this.var3 = var3;
	}

	public void print_vars()
	{
		System.out.println("var1 = " + var1 + "; var2 = " + var2 + "; var3 = " + var3);
	}

	public void print_classes()
	{
		System.out.println(var1.getClass().getName() + " " + var2.getClass().getName() + " " + var3.getClass().getName());
	}

	public static void main(String[] args)
	{
		Task_1<String, Integer, Animal> t = new Task_1<String, Integer, Animal>("abc", 12, new Animal("Dog"));
		t.print_vars();
		t.print_classes();
	}
}
