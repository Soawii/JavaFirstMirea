package ru.mirea.task13.Task_5;

public class Number
{
	String code, first_3, second_3, first_4;
	public Number(String s)
	{
		StringBuilder sb = new StringBuilder(s);
		if (sb.charAt(0) == '8')
		{
			sb.deleteCharAt(0);
			sb.insert(0, "+7");
		}
		first_4 = sb.substring(sb.length() - 4);
		second_3 = sb.substring(sb.length() - 7, sb.length() - 4);
		first_3 = sb.substring(sb.length() - 10, sb.length() - 7);
		code = sb.substring(0, sb.length() - 10);
	}

	String get_styled()
	{
		return code + first_3 + "-" + second_3 + "-" + first_4;
	}

	public static void main(String[] args)
	{
		Number n = new Number("+79175655655");
		System.out.println(n.get_styled());
	}
}
