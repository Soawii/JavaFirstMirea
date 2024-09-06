package ru.mirea.task2.Task_8;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h"};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++)
        {
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
