package ru.mirea.task2.Task_1;

public class TestAuthor {
    public static void main(String[] args)
    {
        Author author = new Author("John", "random_letters@gmail.com", 'M');
        System.out.println(author.toString());
        author.setEmail("new_email@gmail.com");
        System.out.println(author.toString());
        System.out.println(author.getEmail());
        System.out.println(author.getGender());
        System.out.println(author.getName());
    }
}
