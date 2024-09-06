package ru.mirea.task3.Task_3_1;
import java.text.NumberFormat;

public class Money
{
	public final Currency currency;
	public final double amount;

	public Money(Currency currency, double amount)
	{
		this.currency = currency;
		this.amount = amount;
	}

	@Override
	public String toString()
	{
		NumberFormat formatter = NumberFormat.getCurrencyInstance(currency.locale);
		return formatter.format(amount);
	}
}
