package ru.mirea.task4.Task_2;

public enum Size
{
	XXS(32),
	XS(34),
	S(36),
	M(38),
	L(40);

	public final int euro_size;
	private Size(int euro_size)
	{
		this.euro_size = euro_size;
	}

	public String get_description()
	{
		return (this == Size.XXS ? "Детский" : "Взрослый") + " размер";
	}
}
