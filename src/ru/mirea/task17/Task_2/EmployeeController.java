package ru.mirea.task17.Task_2;

public class EmployeeController
{
	Employee model;
	EmployeeView view;

	public String getName()
	{
		return model.getName();
	}

	public void setName(String name)
	{
		model.setName(name);
	}

	public double getSalary()
	{
		return model.getSalary();
	}

	public void setSalary(double salary)
	{
		model.setSalary(salary);
	}

	public void update_view()
	{
		view.print_details(model);
	}
}
