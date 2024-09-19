package ru.mirea.task10;

public class Student
{
	private String first_name, last_name, speciality, group;
	private int year, ID;
	private double GPA;

	public Student(String first_name, String last_name, String speciality, String group, int year, int ID, double GPA)
	{
		this.first_name = first_name;
		this.last_name = last_name;
		this.speciality = speciality;
		this.group = group;
		this.year = year;
		this.ID = ID;
		this.GPA = GPA;
	}

	@Override
	public String toString()
	{
		return "Student(ID: " + ID + ", GPA: " + String.format("%.2f", GPA) + ")";
	}

	public String getFirst_name()
	{
		return first_name;
	}

	public void setFirst_name(String first_name)
	{
		this.first_name = first_name;
	}

	public String getLast_name()
	{
		return last_name;
	}

	public void setLast_name(String last_name)
	{
		this.last_name = last_name;
	}

	public String getSpeciality()
	{
		return speciality;
	}

	public void setSpeciality(String speciality)
	{
		this.speciality = speciality;
	}

	public String getGroup()
	{
		return group;
	}

	public void setGroup(String group)
	{
		this.group = group;
	}

	public int getYear()
	{
		return year;
	}

	public void setYear(int year)
	{
		this.year = year;
	}

	public int getID()
	{
		return ID;
	}

	public void setID(int ID)
	{
		this.ID = ID;
	}

	public double getGPA()
	{
		return GPA;
	}

	public void setGPA(double GPA)
	{
		this.GPA = GPA;
	}
}
