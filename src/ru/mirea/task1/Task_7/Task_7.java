package ru.mirea.task1.Task_7;

import java.util.Scanner;

public class Task_7 {
    public static long factorial(int n)
    {
        int ans = 1;
        for (int i = 2; i <= n; i++)
        {
            ans *= i;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int n;
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        long fact = factorial(n);
        System.out.println("Factorial of " + n + " equals " + fact);
    }
}
