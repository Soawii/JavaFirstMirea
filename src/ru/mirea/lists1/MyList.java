package ru.mirea.lists1;

public interface MyList<T>
{
	void add(T value);

	void add(T value, int at);

	void delete(T data);

	void pop(int at);

	void clear();

	boolean isEmpty();

	T at(int index);
}