package ru.mirea.task28;

import java.util.*;

public class Task_2
{
	static String[] names = new String[]{"Joe", "John", "Joe", "Jane", "Tim", "Dima", "Tim", "Dina", "Leto", "Katya"};
	static String[] surnames = new String[]{"SMITH", "JOHNSON", "BROWN", "JONES", "BROWN", "DAVIS", "MILLER", "WILSON", "MOORE", "TAYLOR"};

	public static HashMap<String, ArrayList<String>> createMap()
	{
		HashMap<String, ArrayList<String>> map = new HashMap<>();
		for (int i = 0; i < 10; i++)
		{
			if (!map.containsKey(names[i]))
				map.put(names[i], new ArrayList<>());
			map.get(names[i]).add(surnames[i]);
		}
		return map;
	}

	public static int getSameFirstNameCount()
	{
		HashSet<String> set = new HashSet<String>(List.of(names));
		return 10 - set.size();
	}

	public static int getSameLastNameCount()
	{
		HashSet<String> set = new HashSet<String>(List.of(surnames));
		return 10 - set.size();
	}

	public static void main(String[] args)
	{
		HashMap<String, ArrayList<String>> name_to_surname = createMap();
		System.out.println(getSameFirstNameCount());
		System.out.println(getSameLastNameCount());
	}
}
