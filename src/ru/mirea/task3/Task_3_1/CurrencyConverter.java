package ru.mirea.task3.Task_3_1;
import java.util.Arrays;
import java.util.Locale;
import java.text.NumberFormat;
import java.util.Scanner;

public class CurrencyConverter
{
	public Money[] convert_currency(Money m)
	{
		Money[] ret = new Money[CurrencyList.currencies.length];
		for (int i = 0; i < CurrencyList.currencies.length; i++)
		{
			double coeff = m.currency.value / CurrencyList.currencies[i].value;
			ret[i] = new Money(CurrencyList.currencies[i], coeff * m.amount);
		}
		return ret;
	}
}
