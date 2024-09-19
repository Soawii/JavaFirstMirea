package ru.mirea.task6.Task_3;

public class Fahrenheit implements Convertable
{
	private double fahrenheit;

	public Fahrenheit(double fahrenheit)
	{
		this.fahrenheit = fahrenheit;
	}

	public double convertTo(Temperature to)
	{
		if (to == Temperature.CELSIUS)
			return (fahrenheit - 32) * 5 / 9;
		else if (to == Temperature.KELVIN)
			return (fahrenheit - 32) * 5 / 9 + 273.15;
		return fahrenheit;
	}
}
