package ru.mirea.task30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Hoffman
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		HashMap<Character, String> map = get_codes(line);
		System.out.println(map);

		HashMap<Character, Node> frequency = get_frequency(line);
		int new_freq = 0;
		for (Character c : map.keySet())
			new_freq += map.get(c).length() * frequency.get(c).freq;
		System.out.println(new_freq * 1.0 / line.length());
	}

	public static HashMap<Character, Node> get_frequency(String line)
	{
		HashMap<Character, Node> frequency = new HashMap<>();
		for (char c : line.toCharArray())
		{
			if (!frequency.containsKey(c))
				frequency.put(c, new Node(c, 0));
			frequency.get(c).freq++;
		}
		return frequency;
	}

	private static class Node
	{
		public char c;
		public int freq;
		public Node left, right;

		Node(char c, int freq)
		{
			this.c = c;
			this.freq = freq;
			left = right = null;
		}

		Node(char c, int freq, Node left, Node right)
		{
			this.c = c;
			this.freq = freq;
			this.left = left;
			this.right = right;
		}
	}

	public static Node get_parent(String line)
	{
		HashMap<Character, Node> frequency = get_frequency(line);

		while (true)
		{
			Node first_min = new Node((char)(' '), Integer.MAX_VALUE), second_min = new Node(' ', Integer.MAX_VALUE);
			Character first_c = null, second_c = null;

			if (frequency.size() < 2) break;
			for (Character c : frequency.keySet())
			{
				if (frequency.get(c).freq < first_min.freq)
				{
					second_min = first_min;
					second_c = first_c;
					first_min = frequency.get(c);
					first_c = c;
				}
				else if (frequency.get(c).freq < second_min.freq)
				{
					second_min = frequency.get(c);
					second_c = c;
				}
			}

			Node parent = new Node(' ', first_min.freq + second_min.freq, first_min, second_min);
			frequency.remove(first_c);
			frequency.remove(second_c);
			frequency.put(first_c, parent);
		}
		Node return_node = null;
		for (Character c : frequency.keySet())
			return_node = frequency.get(c);
		return return_node;
	}

	public static HashMap<Character, String> get_codes(String line)
	{
		Node parent = get_parent(line);
		HashMap<Character, String> codes = new HashMap<>();
		code_helper(parent, new String(), codes);
		return codes;
	}

	public static void code_helper(Node root, String current_string, HashMap<Character, String> frequency)
	{
		if (root == null) return;
		if (root.c >= 'a' && root.c <= 'z')
			frequency.put(root.c, current_string.toString());
		else
		{
			code_helper(root.left, current_string + '0', frequency);
			code_helper(root.right, current_string + '1', frequency);
		}
	}
}
