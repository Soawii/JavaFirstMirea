package ru.mirea.task1.Task_3;

public class Task_3 {
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        System.out.println("Sum = " + sum);
        double mean = (double)sum / arr.length;
        System.out.println("Mean = " + mean);
    }
}
