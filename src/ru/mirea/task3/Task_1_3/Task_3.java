package ru.mirea.task3.Task_1_3;
import java.util.Arrays;
import java.util.Random;

public class Task_3
{
    public static void main(String[] args)
    {
        Random r = new Random();
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++)
        {
            arr[i] = r.nextInt(10, 100);
        }
        System.out.println(Arrays.toString(arr));

        boolean is_increasing = true;
        for (int i = 1; i < 4; i++)
        {
            if (arr[i - 1] >= arr[i])
            {
                is_increasing = false;
                break;
            }
        }

        System.out.println(is_increasing ? "The sequence is increasing" : "The sequence is not increasing");
    }
}
