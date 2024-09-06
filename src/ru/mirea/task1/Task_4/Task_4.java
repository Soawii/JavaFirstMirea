package ru.mirea.task1.Task_4;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args)
    {
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
        {
            arr[i] = sc.nextInt();
        }

        int sum = 0, i = 0, MIN = Integer.MAX_VALUE, MAX = Integer.MIN_VALUE;
        while (i < N)
        {
            sum += arr[i];
            MIN = Math.min(MIN, arr[i]);
            MAX = Math.max(MAX, arr[i]);
            i++;
        }
        System.out.println("Sum of elements: " + sum + "\nMin element: " + MIN + "\nMax element: " + MAX);
    }
}
