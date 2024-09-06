package ru.mirea.task2.Task_7;

import java.util.Arrays;
import java.util.Comparator;

public class BookShelf
{
    private Book[] books = new Book[100];
    private int book_count = 0;

    public void addBook(Book b)
    {
        if (book_count == books.length)
        {
            Book[] new_books = new Book[books.length * 2];
            for (int i = 0; i < books.length; i++)
            {
                new_books[i] = books[i];
            }
            books = new_books;
        }
        books[book_count++] = b;
    }

    public Book getEarliesBook()
    {
        Book ans = null;
        int min_year = Integer.MAX_VALUE;
        for (int i = 0; i < book_count; i++)
        {
            if (books[i].getYear() < min_year)
            {
                min_year = books[i].getYear();
                ans = books[i];
            }
        }
        return ans;
    }

    public Book getLatestBook()
    {
        Book ans = null;
        int max_year = Integer.MIN_VALUE;
        for (int i = 0; i < book_count; i++)
        {
            if (books[i].getYear() > max_year)
            {
                max_year = books[i].getYear();
                ans = books[i];
            }
        }
        return ans;
    }

    public void sortBooks()
    {
        for (int i = 1; i < book_count; i++)
        {
            int j = i;
            while (j > 0 && books[j - 1].getYear() > books[j].getYear())
            {
                Book temp = books[j - 1];
                books[j - 1] = books[j];
                books[j] = temp;
                j--;
            }
        }
    }

    @Override
    public String toString() {
        return "BookShelf{" +
                "books=" + Arrays.toString(books) +
                ", book_count=" + book_count +
                '}';
    }
}
