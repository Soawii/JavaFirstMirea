package ru.mirea.task3.Task_1_1;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        double[] arr = new double[10];

        System.out.println("Choose mode, M for math, R for random");
        Scanner sc = new Scanner(System.in);
        char mode = sc.next().charAt(0);
        if (mode == 'R')
        {
            Random rand = new Random();
            for (int i = 0; i < 10; i++) arr[i] = rand.nextDouble();
        }
        else if (mode == 'M')
        {
            for (int i = 0; i < 10; i++) arr[i] = Math.random();
        }
        else
        {
            System.out.println("Invalid mode");
            return;
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < 10; i++)
        {
            for (int j = 1; j < 10 - i; j++)
            {
                if (arr[j] < arr[j - 1])
                {
                    double temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
