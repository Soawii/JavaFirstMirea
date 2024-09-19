package ru.mirea.task20;

class Matrix<T extends Number>
{
	T[][] matrix;
	int rows, cols;

	public Matrix(int rows, int cols)
	{
		matrix = (T[][])(new Number[rows][cols]);
		this.rows = rows;
		this.cols = cols;
	}

	public void fillMatrix(T number)
	{
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < cols; j++)
			{
				matrix[i][j] = number;
			}
		}
	}

	public void printMatrix()
	{
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < cols; j++)
			{
				System.out.printf("%.2f ", matrix[i][j].floatValue());
			}
			System.out.println();
		}
	}

	public static <T extends Number, V extends Number> Matrix<T> add_matrices(Matrix<T> l, Matrix<V> r)
	{
		if (l.rows != r.rows || l.cols != r.cols)
		{
			throw new IllegalArgumentException("Matrix does not have the same number of rows and columns");
		}
		Matrix<T> result = new Matrix<T>(l.rows, l.cols);
		for (int i = 0; i < l.rows; i++)
		{
			for (int j = 0; j < l.cols; j++)
			{
				result.matrix[i][j] = (T)(Double)(l.matrix[i][j].doubleValue() + r.matrix[i][j].doubleValue());
			}
		}
		return result;
	}
}

public class Task_5
{
	public static void main(String[] args)
	{
		Matrix<Double> m = new Matrix<>(3, 3);
		m.fillMatrix(2.2);

		Matrix<Integer> a = new Matrix<>(3, 3);
		a.fillMatrix(3);

		Matrix.add_matrices(m, a).printMatrix();
	}
}
