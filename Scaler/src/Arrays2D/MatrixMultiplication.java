package Arrays2D;

public class MatrixMultiplication {
    public static void main(String[] args) {
        MatrixMultiplication matrixMul = new MatrixMultiplication();
        int[][] A = {{5, 7}};
        int[][] B = {{1, 3}, {2, 4}};
        int[][] C = matrixMul.solve(A, B);
        for (int[] X : C) {
            for (int Y : X) {
                System.out.print(Y + " ");
            }
        }
        System.out.println();
    }

    public int[][] solve(int[][] A, int[][] B) {
        int aLen = A.length;
        int bLen = B.length;
        int bColLen = B[0].length;

        // resultant matrix will have same number of rows as A, same number of columns as B
        int[][] result = new int[A.length][B[0].length];

        for (int i = 0; i < aLen; i++) {
            for (int j = 0; j < bColLen; j++) {
                result[i][j] = 0;
                for (int k = 0; k < bLen; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }
}
