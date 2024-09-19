package ru.mirea.task17.Task_1;

public class Demo
{
	public static Student retrieveStudentFromDatabse()
	{
		Student student = new Student();
		student.setName("Mirea");
		student.setRollNo("12");
		return student;
	}

	public static void main(String[] args)
	{
		Student student = retrieveStudentFromDatabse();
		StudentView view = new StudentView();
		StudentController controller = new StudentController();
		controller.model = student;
		controller.view = view;
		controller.updateView();
	}
}
