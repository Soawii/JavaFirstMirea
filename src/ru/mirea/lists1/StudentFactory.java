package ru.mirea.lists1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentFactory
{
	public static Student createStudent(String name, int age, String school) {
		return new Student(name, age, school);
	}

	public static Student createStudent(String fromString) {
		String name;
		int age;
		String school;

		Pattern p = Pattern.compile("\\b(\\w+).(\\d+).(\\w+)\\b");
		Matcher m = p.matcher(fromString);

		if (!m.matches()) {
			System.out.println("Wrong student input: " + fromString);
		}

		name = m.group(1);
		age = Integer.parseInt(m.group(2));
		school = m.group(3);

		return createStudent(name, age, school);
	}
}
