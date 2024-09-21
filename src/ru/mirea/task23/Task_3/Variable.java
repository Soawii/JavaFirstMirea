package ru.mirea.task23.Task_3;

public class Variable implements Expression
{
    public final char name;

    public Variable(char name)
    {
        this.name = name;
    }

    @Override
    public double evaluate(double x, double y, double z) {
        return (name == 'x' ? x : (name == 'y' ? y : z));
    }

    @Override
    public double evaluate(double x) {
        return evaluate(x, 0, 0);
    }
}
