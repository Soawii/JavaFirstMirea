package ru.mirea.task2.Task_3;

public class Point {
    public double x, y;

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString()
    {
        return "Point(" + x + ", " + y + ")";
    }
}
