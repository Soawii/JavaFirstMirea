package ru.mirea.task6.Task_3;

public class Kelvin implements Convertable
{
	private double kelvin;

	public Kelvin(double kelvin)
	{
		this.kelvin = kelvin;
	}

	public double convertTo(Temperature to)
	{
		if (to == Temperature.CELSIUS)
			return kelvin - 273.15;
		else if (to == Temperature.FAHRENHEIT)
			return (kelvin - 273.15) * 9 / 5 + 32;
		return kelvin;
	}
}