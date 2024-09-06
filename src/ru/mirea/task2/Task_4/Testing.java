package ru.mirea.task2.Task_4;

public class Testing
{
    public static void main(String[] args)
    {
        Shop shop = new Shop();
        shop.addComputer(new Computer("a", "red", 2005));
        shop.addComputer(new Computer("b", "black", 2021));

        System.out.println(shop.findComputer(new Computer("b", "black", 2021)));
        System.out.println(shop.findComputer(new Computer("b", "black", 2020)));

        shop.deleteComputer(new Computer("b", "black", 2021));
        System.out.println(shop.findComputer(new Computer("b", "black", 2021)));
    }
}
