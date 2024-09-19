package ru.mirea.task17.Task_2;

public class Main
{
	public static Employee get_employee_from_db()
	{
		Employee model = new Employee();
		model.setName("John");
		model.setSalary(1000);
		return model;
	}

	public static void main(String[] args)
	{
		Employee model = get_employee_from_db();
		EmployeeView view = new EmployeeView();
		EmployeeController controller = new EmployeeController();
		controller.model = model;
		controller.view = view;
		controller.update_view();
	}
}
