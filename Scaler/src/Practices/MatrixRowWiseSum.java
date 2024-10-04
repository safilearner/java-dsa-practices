package Practices;

public class MatrixRowWiseSum {
    public static void main(String[] args) {
        MatrixRowWiseSum matRowSum = new MatrixRowWiseSum();
        int[][] A = {{3, -1, 2, 6, 1}, {3, 2, 1, 7, -3}, {6, -3, 4, -3, -2}, {10, 2, 3, -7, 3}};
        matRowSum.rowWise(A);
    }

    public void rowWise(int[][] A) {
        int rowLen = A.length;
        int colLen = A[0].length;
        for (int i = 0; i < rowLen; i++) {
            int sum = 0;
            for (int j = 0; j < colLen; j++) {
                sum = sum + A[i][j];
            }
            System.out.println(sum);
        }
    }
}
