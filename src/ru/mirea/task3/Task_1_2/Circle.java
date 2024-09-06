package ru.mirea.task3.Task_1_2;

public class Circle
{
    private Point center;
    private double radius;

    Circle(Point center, double radius)
    {
        this.center = center;
        this.radius = radius;
    }

    public boolean is_smaller(Circle o)
    {
        return this.radius < o.getRadius();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
}
