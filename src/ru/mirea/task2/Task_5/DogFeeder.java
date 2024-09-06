package ru.mirea.task2.Task_5;

public class DogFeeder
{
    private Dog[] dogs = new Dog[10];
    private int dog_count = 0;

    void addDogs(Dog[] dogs_to_add)
    {
        while (dog_count + dogs.length >= dogs.length)
        {
            Dog[] newDogs = new Dog[dogs.length * 2];
            for (int i = 0; i < dogs.length; i++)
            {
                newDogs[i] = dogs[i];
            }
            dogs = newDogs;
        }
        for (int i = 0; i < dogs_to_add.length; i++)
        {
            dogs[dog_count + i] = dogs_to_add[i];
        }
        dog_count += dogs_to_add.length;
    }
}
