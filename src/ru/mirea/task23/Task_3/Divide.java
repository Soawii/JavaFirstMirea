package ru.mirea.task23.Task_3;

public class Divide extends BinaryOperation implements Expression
{
    public Divide(Expression l, Expression r)
    {
        super(l, r);
    }

    @Override
    public double evaluate(double x, double y, double z) {
        return l.evaluate(x, y, z) / r.evaluate(x, y, z);
    }

    @Override
    public double evaluate(double x) {
        return evaluate(x, 0, 0);
    }
}
