package ru.mirea.task27;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

class Pair<K, V>
{
	public K first;
	public V second;

	Pair(K first, V second)
	{
		this.first = first;
		this.second = second;
	}

	@Override
	public String toString()
	{
		return "Pair {" +
				"first = " + first +
				", second = " + second +
				'}';
	}
}

class HashTable<K, V>
{
	static final int bucket_amount = 1000;
	public Object[] buckets;

	HashTable()
	{
		buckets = new Object[bucket_amount];
		for (int i = 0; i < bucket_amount; i++)
			buckets[i] = new LinkedList<Pair<K, V>>();
	}

	public void put(K k, V v)
	{
		int bucket = Math.abs(k.hashCode()) % bucket_amount;
		LinkedList<Pair<K, V>> list = (LinkedList<Pair<K, V>>)(buckets[bucket]);
		Iterator<Pair<K, V>> i = list.iterator();
		while (i.hasNext())
		{
			Pair<K, V> p = i.next();
			if (p.first.equals(k))
			{
				p.second = v;
				return;
			}
		}
		list.addLast(new Pair<>(k, v));
	}

	public V get(K key)
	{
		int bucket = Math.abs(key.hashCode()) % bucket_amount;
		LinkedList<Pair<K, V>> list = (LinkedList<Pair<K, V>>)(buckets[bucket]);
		Iterator<Pair<K, V>> i = list.iterator();
		while (i.hasNext())
		{
			Pair<K, V> p = i.next();
			if (p.first.equals(key))
			{
				return p.second;
			}
		}
		return null;
	}

	public void delete(K key)
	{
		int bucket = Math.abs(key.hashCode()) % bucket_amount;
		LinkedList<Pair<K, V>> list = (LinkedList<Pair<K, V>>)(buckets[bucket]);
		Iterator<Pair<K, V>> i = list.iterator();
		while (i.hasNext())
		{
			Pair<K, V> p = i.next();
			if (p.first.equals(key))
			{
				i.remove();
				break;
			}
		}
	}


	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder("HashTable\n");
		for (int i = 0; i < bucket_amount; i++)
		{
			LinkedList<Pair<K, V>> list = (LinkedList<Pair<K, V>>)(buckets[i]);
			if (!list.isEmpty())
			{
				Iterator<Pair<K, V>> it = list.iterator();
				while (it.hasNext())
				{
					sb.append(it.next()).append('\n');
				}
			}
		}
		return sb.toString();
	}
}

public class Task_1
{
	public static void main(String[] args)
	{
		HashTable<Integer, String> table = new HashTable<Integer, String>();
		for (int i = 0; i < 10; i++)
		{
			table.put(i, Integer.toString(i * 11 + 2));
		}
		System.out.println(table);
		table.delete(2);
		System.out.println(table);
		table.put(4, "new string");
		System.out.println(table);
		System.out.println(table.get(4));
	}
}
