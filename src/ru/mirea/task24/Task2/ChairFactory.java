package ru.mirea.task24.Task2;

public class ChairFactory implements AbstractChairFactory
{
	public VictorianChair createVictorianChair() {
		return new VictorianChair(10);
	}

	public MagicChair createMagicChair() {
		return new MagicChair();
	}

	public FunctionalChair createFunctionalChair() {
		return new FunctionalChair();
	}
}
