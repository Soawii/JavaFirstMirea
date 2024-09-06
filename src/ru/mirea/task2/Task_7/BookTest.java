package ru.mirea.task2.Task_7;

public class BookTest
{
    public static void main(String[] args)
    {
        Book b = new Book("John", "ABC", 1990);
        System.out.println(b);

        System.out.println(b.equals(new Book("John", "ABC", 1990)));
        System.out.println(b.equals(new Book("John", "ABC", 1989)));

        b.setAuthor("Randy");
        System.out.println(b.equals(new Book("John", "ABC", 1990)));
        System.out.println(b.equals(new Book("Randy", "ABC", 1990)));
        System.out.println(b);

        BookShelf shelf = new BookShelf();
        shelf.addBook(new Book("A", "ABC1", 1990));
        shelf.addBook(new Book("B", "ABC2", 1955));
        shelf.addBook(new Book("D", "ABC3", 2000));
        shelf.addBook(new Book("C", "ABC4", 1700));
        System.out.println(shelf);

        System.out.println(shelf.getEarliesBook());
        System.out.println(shelf.getLatestBook());

        shelf.sortBooks();
        System.out.println(shelf);
    }
}
