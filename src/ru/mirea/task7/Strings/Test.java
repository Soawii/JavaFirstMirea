package ru.mirea.task7.Strings;

public class Test
{
	public static void main(String[] args)
	{
		String a = "abcdef";
		System.out.println(StringFunctions.count_char(a, 'a'));
		System.out.println(StringFunctions.second_char_string(a));
		System.out.println(StringFunctions.get_inverse(a));
	}
}
