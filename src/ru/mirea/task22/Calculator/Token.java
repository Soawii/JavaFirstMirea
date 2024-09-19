package ru.mirea.task22.Calculator;

public interface Token
{
	public String getName();
	public String getAllowed();
	public String consume(String expression, int l);
}
