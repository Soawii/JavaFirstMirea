package ru.mirea.task2.Task_4;

public class Shop
{
    private Computer[] computers;
    private int computer_amount = 0;

    public Shop()
    {
        computers = new Computer[10];
    }

    public void addComputer(Computer computer)
    {
        if (computer_amount == computers.length - 1)
        {
            Computer[] new_computer = new Computer[computers.length * 2];
            for (int i = 0; i < computer_amount; i++)
            {
                new_computer[i] = computers[i];
            }
            computers = new_computer;
        }
        computers[computer_amount++] = computer;
    }

    public boolean deleteComputer(Computer computer)
    {
        for (int i = 0; i < computer_amount; i++)
        {
            if (computer.equals(computers[i]))
            {
                for (int j = i; j < computer_amount; j++)
                {
                    computers[j] = computers[j + 1];
                }
                computer_amount--;
                return true;
            }
        }
        return false;
    }

    public int findComputer(Computer computer)
    {
        for (int i = 0; i < computer_amount; i++)
        {
            if (computer.equals(computers[i]))
            {
                return i;
            }
        }
        return -1;
    }
}
