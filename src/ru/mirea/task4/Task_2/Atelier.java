package ru.mirea.task4.Task_2;

public class Atelier
{
	public void dressMan(Clothes[] clothes)
	{
		System.out.println("Dressing men...");
		for (int i = 0; i < clothes.length; i++)
		{
			if (clothes[i] instanceof MenClothing)
			{
				System.out.println(clothes[i]);
				((MenClothing) clothes[i]).dressMan();
			}
		}
	}

	public void dressWoman(Clothes[] clothes)
	{
		System.out.println("Dressing women...");
		for (int i = 0; i < clothes.length; i++)
		{
			if (clothes[i] instanceof WomenClothing)
			{
				System.out.println(clothes[i]);
				((WomenClothing) clothes[i]).dressWoman();
			}
		}
	}

	public static void main(String[] args)
	{
		Clothes[] cloth_types = {new Tie(Size.L, 12.23, "RED"),
									new Pants(Size.M, 34.56, "BLACK"),
									new Skirt(Size.XXS, 56.21, "WHITE"),
									new TShirt(Size.L, 100, "GREEN")};
		Atelier atelier = new Atelier();
		atelier.dressMan(cloth_types);
		atelier.dressWoman(cloth_types);
	}
}
