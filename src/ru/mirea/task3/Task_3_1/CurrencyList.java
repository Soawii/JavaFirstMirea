package ru.mirea.task3.Task_3_1;

import java.util.Locale;

public class CurrencyList
{
	public static Currency[] currencies = {new Currency("ru", new Locale("ru"), 1),
											new Currency("us", Locale.US, 89.11),
											new Currency("fr", Locale.FRANCE, 99.14)};
	public static Currency get_currency(String code)
	{
		for (Currency currency : currencies)
		{
			if (code.equals(currency.code))
				return currency;
		}
		System.out.println("Currency not found");
		return null;
	}
}
