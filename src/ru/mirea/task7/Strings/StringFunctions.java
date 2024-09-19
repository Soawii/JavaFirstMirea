package ru.mirea.task7.Strings;

public interface StringFunctions
{
	static int count_char(String s, char c)
	{
		int count = 0;
		for (int i = 0; i < s.length(); i++)
		{
			count += s.charAt(i) == c ? 1 : 0;
		}
		return count;
	}

	static String second_char_string(String s)
	{
		String ans = "";
		for (int i = 0; i < s.length(); i += 2)
		{
			ans = ans + s.charAt(i);
		}
		return ans;
	}

	static String get_inverse(String s)
	{
		String ans = "";
		for (int i = s.length() - 1; i >= 0; i--)
		{
			ans = ans + s.charAt(i);
		}
		return ans;
	}
}
