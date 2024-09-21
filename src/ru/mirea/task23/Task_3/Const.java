package ru.mirea.task23.Task_3;

public class Const implements Expression
{
    public final double var;

    public Const(double var)
    {
        this.var = var;
    }

    @Override
    public double evaluate(double x, double y, double z) {
        return var;
    }

    @Override
    public double evaluate(double x) {
        return evaluate(x, 0, 0);
    }
}
