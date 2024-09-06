package ru.mirea.task2.Task_3;

public class Testing
{
    public static void main(String[] args)
    {
        Circle[] arr = new Circle[10];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = new Circle(new Point(i * 2, i / 2.0), i * 10);
            System.out.println(arr[i]);
        }
    }
}
