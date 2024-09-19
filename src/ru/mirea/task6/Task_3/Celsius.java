package ru.mirea.task6.Task_3;

public class Celsius implements Convertable
{
	private double celsius;

	public Celsius(double celsius)
	{
		this.celsius = celsius;
	}


	public double convertTo(Temperature to)
	{
		if (to == Temperature.FAHRENHEIT)
			return celsius * 9 / 5 + 32;
		else if (to == Temperature.KELVIN)
			return celsius + 273.15;
		return celsius;
	}
}
