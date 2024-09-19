package ru.mirea.task19.Task_1;

import javax.swing.text.DefaultEditorKit;

class CustomerNotFoundException extends Exception
{
	public CustomerNotFoundException(String message)
	{
		super(message);
	}
}

class IncorrectINNException extends Exception
{
	public IncorrectINNException(String message)
	{
		super(message);
	}
}

public class Task_1
{
	Customer[] customers = new Customer[10];
	int customer_amount = 0;

	public Task_1()
	{
		customers = new Customer[10];
	}

	public void customer_buy_helper(String customer, String INN)
	{
		try
		{
			customer_buy(customer, INN);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

	public void customer_buy(String customer, String INN) throws Exception
	{
		Customer c = null;
		for (int i = 0; i < customer_amount; i++)
		{
			if (customer.equals(customers[i].name))
			{
				c = customers[i];
				break;
			}
		}
		if (c == null)
		{
			throw new CustomerNotFoundException("Customer " + customer + " not found");
		}
		if (!INN.equals(c.INN))
		{
			throw new IncorrectINNException("INN " + INN + " for customer " + customer + " is incorrect");
		}
		System.out.println("Customer " + customer + " purchase is successful!");
	}

	public void add_customer(Customer customer)
	{
		if (customer_amount == customers.length)
		{
			Customer[] temp = new Customer[customers.length * 2];
			System.arraycopy(customers, 0, temp, 0, customers.length);
			customers = temp;
		}
		customers[customer_amount++] = customer;
	}

	public static void main(String[] args)
	{
		Task_1 t = new Task_1();
		t.add_customer(new Customer("Tim", "123"));
		t.add_customer(new Customer("John", "456"));
		t.add_customer(new Customer("Anna", "789"));
		t.add_customer(new Customer("Dima", "789"));

		t.customer_buy_helper("Tim", "123");
		t.customer_buy_helper("Tim", "456");
		t.customer_buy_helper("Name", "456");
	}
}
