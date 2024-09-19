package ru.mirea.task6.Task_3;

public class Test
{
	public static void main(String[] args)
	{
		Celsius celsius = new Celsius(10);
		Fahrenheit fahrenheit = new Fahrenheit(80);
		Kelvin kelvin = new Kelvin(280);

		System.out.println(celsius.convertTo(Temperature.KELVIN));
		System.out.println(celsius.convertTo(Temperature.FAHRENHEIT));

		System.out.println(fahrenheit.convertTo(Temperature.KELVIN));
		System.out.println(fahrenheit.convertTo(Temperature.CELSIUS));

		System.out.println(kelvin.convertTo(Temperature.CELSIUS));
		System.out.println(kelvin.convertTo(Temperature.FAHRENHEIT));
	}
}
