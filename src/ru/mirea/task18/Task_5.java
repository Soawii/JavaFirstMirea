package ru.mirea.task18;

public class Task_5 {
	public void getDetails(String key) {
		if (key == null) {
			throw new NullPointerException("null key in getDetails" );
		}
		System.out.println(key);
	}

	public static void main(String[] args)
	{
		Task_5 task = new Task_5();
		try
		{
			task.getDetails("key");
			task.getDetails(null);
		}
		catch (NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
	}
}