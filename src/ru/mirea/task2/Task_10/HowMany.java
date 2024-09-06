package ru.mirea.task2.Task_10;
import java.util.Scanner;

public class HowMany
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();

        while (line.contains("  "))
        {
            line = line.replaceAll("  ", " ");
        }
        System.out.println(line.split(" ").length);
    }
}
