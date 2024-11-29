package ru.mirea.lists2;

public class CycleLinkedList<T> implements MyList<T>
{
	private static class Node<T> {
		public T data;
		public Node<T> prev = null, next = null;

		public Node(T data) {
			this.data = data;
		}
	}

	private Node<T> head = null;
	int size;

	private void pop_element(Node<T> curr) {
		if (curr == null)
			return;
		size--;
		curr.prev.next = curr.next;
		curr.next.prev = curr.prev;
		if (curr == head) {
			head = curr.next;
		}
	}

	public void add(T value) {
		add(value, size);
	}

	@Override
	public void add(T value, int at)
	{
		if (at < -size || at > size) {
			throw new IndexOutOfBoundsException();
		}
		size++;
		Node<T> new_node = new Node<T>(value);
		if (size == 1) {
			head = new_node;
			head.prev = head;
			head.next = head;
		}
		else if (at == size - 1) {
			new_node.prev = head.prev;
			new_node.next = head;
			head.prev.next = new_node;
			head.prev = new_node;
		}
		else {
			Node<T> temp = head;
			for (int i = 0; i < Math.abs(at); i++) {
				temp = at > 0 ? temp.next : temp.prev;
			}
			new_node.next = temp;
			new_node.prev = temp.prev;
			temp.prev.next = new_node;
			temp.prev = new_node;
			if (temp == head)
				head = new_node;
		}
	}

	public void delete(T data) {
		Node<T> prev = null, temp = head;
		for (int i = 0; i < size; i++) {
			if (temp.data.equals(data)) {
				pop_element(temp);
				return;
			}
			prev = temp;
			temp = temp.next;
		}
	}

	@Override
	public void pop(int at)
	{
		if (at < -size || at >= size) {
			throw new IndexOutOfBoundsException();
		}
		Node<T> temp = head;
		for (int i = 0; i < Math.abs(at); i++) {
			temp = at > 0 ? temp.next : temp.prev;
		}
		pop_element(temp);
	}

	public void clear() {
		head = null;
		size = 0;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public T at(int index)
	{
		if (index >= size || index < -size) {
			throw new IndexOutOfBoundsException();
		}
		Node<T> temp = head;
		for (int i = 0; i < Math.abs(index); i++)
		{
			temp = index > 0 ? temp.next : temp.prev;
		}
		return temp.data;
	}

	@Override
	public String toString() {
		StringBuilder out = new StringBuilder("CycleLinkedList(");
		Node<T> temp = head;
		for (int i = 0; i < size; i++) {
			if (i > 0)
				out.append(",");
			out.append(temp.data.toString());
			temp = temp.next;
		}
		return out.append(")").toString();
	}
}
