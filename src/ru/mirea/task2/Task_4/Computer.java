package ru.mirea.task2.Task_4;

public class Computer
{
    private String name, color;
    private int year;

    public Computer(String name, String color, int year)
    {
        this.name = name;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString()
    {
        return "Computer [name=" + name + ", color=" + color + ", year=" + year + "]";
    }

    public boolean equals(Computer computer)
    {
        return this.name.equals(computer.name) && this.color.equals(computer.color) && this.year == computer.year;
    }
}
