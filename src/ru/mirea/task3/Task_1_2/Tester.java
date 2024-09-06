package ru.mirea.task3.Task_1_2;
import java.util.Random;

public class Tester
{
    private Circle[] circles;
    private int circle_amount;

    public Tester(int circle_amount)
    {
        this.circle_amount = circle_amount;
        circles = new Circle[circle_amount];

        Random r = new Random();
        for (int i = 0; i < circle_amount; i++)
        {
            circles[i] = new Circle(new Point(r.nextDouble(), r.nextDouble()), r.nextDouble());
        }
    }

    public Circle get_smallest_circle()
    {
        Circle smallest_circle = circles[0];
        for (int i = 1; i < circle_amount; i++)
        {
            if (!smallest_circle.is_smaller(circles[i]))
            {
                smallest_circle = circles[i];
            }
        }
        return smallest_circle;
    }

    public Circle get_largest_circle()
    {
        Circle largest_circle = circles[0];
        for (int i = 1; i < circle_amount; i++)
        {
            if (largest_circle.is_smaller(circles[i]))
            {
                largest_circle = circles[i];
            }
        }
        return largest_circle;
    }

    public void sort_circles()
    {
        for (int i = 0; i < circle_amount; i++)
        {
            for (int j = 1; j < circle_amount - i; j++)
            {
                if (circles[j].is_smaller(circles[j - 1]))
                {
                    Circle temp = circles[j];
                    circles[j] = circles[j - 1];
                    circles[j - 1] = temp;
                }
            }
        }
    }
}
