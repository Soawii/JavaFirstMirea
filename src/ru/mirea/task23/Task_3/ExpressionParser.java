package ru.mirea.task23.Task_3;

public class ExpressionParser
{
    public double x, y, z;

    public Expression parse(String s, double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
        return parse_helper(new StringBuilder(s), 0, s.length() - 1);
    }

    public Expression parse_helper(StringBuilder s, int l, int r)
    {
        int b_pos = -1, count = 0;
        for (int i = l; i <= r; i++)
        {
            if (s.charAt(i) == '(') {
                count++;
                if (b_pos == -1)
                    b_pos = i;
            }
            else if (s.charAt(i) == ')')
            {
                count--;
                if (count == 0)
                {
                    Expression new_e = parse_helper(s, b_pos + 1, i - 1);
                    StringBuilder new_string = new StringBuilder(Double.toString(new_e.evaluate(x, y, z)));
                    s.replace(b_pos, i + 1, new_string.toString());
                    i += (new_string.length() - (i - b_pos + 1));
                    b_pos = -1;
                }
            }
        }
        return new Const(2);
    }
}
