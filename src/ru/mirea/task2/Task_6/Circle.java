package ru.mirea.task2.Task_6;

public class Circle
{
    private double x, y;
    private double radius;

    public Circle(double x, double y, double radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    public double getLength()
    {
        return 2 * Math.PI * radius;
    }

    public boolean equals(Circle c)
    {
        return this.radius == c.radius && this.x == c.x && this.y == c.y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
