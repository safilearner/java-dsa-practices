package Practices;

public class MatrixColWiseSum {
    public static void main(String[] args) {
        MatrixColWiseSum matColSum = new MatrixColWiseSum();
        int[][] A = {{3, -1, 2, 6, 1}, {3, 2, 1, 7, -3}, {6, -3, 4, -3, -2}, {10, 2, 3, -7, 3}};
        matColSum.colSum(A);

    }

    public void colSum(int[][] A) {
        int N = A.length;
        int M = A[0].length;
        // Iterate through columns first
        for (int i = 0; i < M; i++) {
            int sum = 0;
            // then iterate through rows
            for (int j = 0; j < N; j++) {
                sum = sum + A[j][i];
            }
            System.out.println(sum);
        }
    }
}
