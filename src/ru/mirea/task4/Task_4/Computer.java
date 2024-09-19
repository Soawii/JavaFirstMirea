package ru.mirea.task4.Task_4;


public class Computer
{
	private Processor processor;
	private Monitor monitor;
	private Memory[] memory_list;

	public Computer(Processor processor, Monitor monitor, Memory[] memory_list)
	{
		this.processor = processor;
		this.monitor = monitor;
		this.memory_list = memory_list;
	}

	public Processor getProcessor()
	{
		return processor;
	}

	public void setProcessor(Processor processor)
	{
		this.processor = processor;
	}

	public Monitor getMonitor()
	{
		return monitor;
	}

	public void setMonitor(Monitor monitor)
	{
		this.monitor = monitor;
	}

	public Memory[] getMemory_list()
	{
		return memory_list;
	}

	public void setMemory_list(Memory[] memory_list)
	{
		this.memory_list = memory_list;
	}
}
