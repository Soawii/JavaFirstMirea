package ru.mirea.task3.Task_3_1;

import java.util.Locale;

public class Currency
{
	public final String code;
	public final double value;
	public final Locale locale;

	public Currency(String code, Locale locale, double value)
	{
		this.code = code;
		this.value = value;
		this.locale = locale;
	}
}
