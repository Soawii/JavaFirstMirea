package ru.mirea.lists1;

import java.util.Objects;

public class Student
{
	public String name;
	public int age;
	public String school;

	public Student(String name, int age, String school)
	{
		this.name = name;
		this.age = age;
		this.school = school;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getSchool()
	{
		return school;
	}

	public void setSchool(String school)
	{
		this.school = school;
	}

	@Override
	public String toString()
	{
		return "Student{" +
				"name='" + name + '\'' +
				", age=" + age +
				", school='" + school + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return age == student.age && Objects.equals(name, student.name) && Objects.equals(school, student.school);
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(name, age, school);
	}
}
