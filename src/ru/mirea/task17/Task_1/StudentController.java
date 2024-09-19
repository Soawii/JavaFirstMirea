package ru.mirea.task17.Task_1;

public class StudentController
{
	public Student model;
	public StudentView view;

	public StudentController()
	{
	}

	public void setStudentName(String name)
	{
		model.setName(name);
	}

	public String getStudentName()
	{
		return model.getName();
	}

	public void setStudentRollno(String rollno)
	{
		model.setRollNo(rollno);
	}

	public String getStudentRollno()
	{
		return model.getRollNo();
	}

	void updateView()
	{
		view.printStudentDetails(model);
	}
}
