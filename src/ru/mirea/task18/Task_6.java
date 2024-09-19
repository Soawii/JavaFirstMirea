package ru.mirea.task18;

public class Task_6 {
	public void printMessage(String key) {
		String message;
		try
		{
			message = getDetails(key);
		}
		catch(Exception e)
		{
			System.out.println(e);
			return;
		}
		System.out.println( message );
	}
	public String getDetails(String key) {
		if(key == null) {
			throw new NullPointerException( "null key in getDetails" );
		}
		return "data for" + key;
	}

	public static void main(String[] args)
	{
		Task_6 task = new Task_6();
		task.printMessage( "Hello World" );
		task.printMessage(null);
		int arr = 15; 	
	}
}