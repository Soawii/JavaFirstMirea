package ru.mirea.task2.Task_2;

public class TestBall
{
    public static void main(String[] args)
    {
        Ball b = new Ball(1.0, 2.0);
        System.out.println(b);
        b.move(0.1, 0.1);
        System.out.println(b);
        b.setX(0.5);
        b.setY(0.9);
        System.out.println(b);
        b.setXY(0.1, 0.05);
        System.out.println(b);
        System.out.println(b.getX() + " " + b.getY());
    }
}
