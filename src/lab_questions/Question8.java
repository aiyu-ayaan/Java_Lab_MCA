package lab_questions;

/**
 * Write a program for developing a matrix class which can handle integer matrices of different dimensions.
 * Also overload the operator for addition, multiplication & comparison of matrices.
 */
public class Question8 {
    static class Matrix {
        int[][] matrix;

        Matrix(int[][] matrix) {
            this.matrix = matrix;
        }

        Matrix add(Matrix m) {
            int[][] result = new int[matrix.length][matrix[0].length];
            for (int i = 0; i < matrix.length; i++)
                for (int j = 0; j < matrix[0].length; j++)
                    result[i][j] = matrix[i][j] + m.matrix[i][j];
            return new Matrix(result);
        }

        Matrix multiply(Matrix m) {
            int[][] result = new int[matrix.length][m.matrix[0].length];
            for (int i = 0; i < matrix.length; i++)
                for (int j = 0; j < m.matrix[0].length; j++)
                    for (int k = 0; k < matrix[0].length; k++)
                        result[i][j] += matrix[i][k] * m.matrix[k][j];
            return new Matrix(result);
        }

        boolean equals(Matrix m) {
            if (matrix.length != m.matrix.length || matrix[0].length != m.matrix[0].length)
                return false;
            for (int i = 0; i < matrix.length; i++)
                for (int j = 0; j < matrix[0].length; j++)
                    if (matrix[i][j] != m.matrix[i][j])
                        return false;
            return true;
        }

        void print() {
            for (int[] row : matrix) {
                for (int element : row)
                    System.out.print(element + " ");
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        Matrix m1 = new Matrix(new int[][]{{1, 2, 3}, {4, 5, 6}});
        Matrix m2 = new Matrix(new int[][]{{1, 2, 3}, {4, 5, 6}});
        Matrix m3 = new Matrix(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        Matrix m4 = new Matrix(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        Matrix m5 = new Matrix(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        Matrix m6 = new Matrix(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        Matrix m7 = new Matrix(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        Matrix m8 = new Matrix(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        Matrix m9 = new Matrix(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        Matrix m10 = new Matrix(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        System.out.println("Matrix 1:");
        m1.print();
        System.out.println("Matrix 2:");
        m2.print();
        System.out.println("Matrix 3:");
        m3.print();
        System.out.println("Matrix 4:");
        m4.print();
        System.out.println("Matrix 5:");
        m5.print();
        System.out.println("Matrix 6:");
        m6.print();
        System.out.println("Matrix 7:");
        m7.print();
        System.out.println("Matrix 8:");
        m8.print();
        System.out.println("Matrix 9:");
        m9.print();
        System.out.println("Matrix 10:");
        m10.print();
        System.out.println("Matrix 1 + Matrix 2:");
        m1.add(m2).print();
        System.out.println("Matrix 3 * Matrix 4:");
        m3.multiply(m4).print();
        System.out.println("Matrix 5 == Matrix 6: " + m5.equals(m6));
        System.out.println("Matrix 7 == Matrix 8: " + m7.equals(m8));
        System.out.println("Matrix 9 == Matrix 10: " + m9.equals(m10));

    }
}
