package ru.mirea.task2.Task_6;

public class CircleTest
{
    public static void main(String[] args)
    {
        Circle c = new Circle(1, 2, 5);

        System.out.println(c.equals(new Circle(1, 2, 5)));
        System.out.println(c.equals(new Circle(1, 2, 6)));

        System.out.println(c.getArea());
        System.out.println(c.getLength());

        c.setX(2);
        c.setY(1);
        c.setRadius(2.5);

        System.out.println(c.getArea());
    }
}
