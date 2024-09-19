package ru.mirea.task4.Task_1;

public class Task_1
{
	public enum Season
	{
		WINTER(-11.2),
		SPRING(11.6),
		SUMMER(25.4),
		AUTUMN(7.2);

		public final double avg;

		private Season(double avg)
		{
			this.avg = avg;
		}

		public void print_love()
		{
			String out = "";
			switch(this)
			{
				case WINTER:
					out = "зиму";
					break;
				case SPRING:
					out = "весну";
					break;
				case SUMMER:
					out = "лето";
					break;
				case AUTUMN:
					out = "осень";
					break;
			}
			System.out.println("Я люблю " + out);
		}

		public String get_description()
		{
			return (this == Season.SUMMER ? "Тёплое" : "Холодное") + " время года";
		}
	}

	public static void main(String[] args)
	{
		Season fav_season = Season.SUMMER;
		System.out.println("My favorite season is " + fav_season);

		fav_season.print_love();

		for (Season season : Season.values())
		{
			System.out.println("Season: " + season + ", avg temp = " + season.avg + ", description = " + season.get_description());
		}
	}
}
