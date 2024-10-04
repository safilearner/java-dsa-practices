package Arrays2D;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] B = {{1, 2}, {1, 2}, {1, 2}};
        MatrixTranspose matTrans = new MatrixTranspose();
        int[][] result = matTrans.solve(A);

        for (int[] arr : result) {
            for (int X : arr) {
                System.out.print(X + " ");
            }
            System.out.println();
        }

        result = matTrans.solve(B);

        for (int[] arr : result) {
            for (int X : arr) {
                System.out.print(X + " ");
            }
            System.out.println();
        }
    }

    public int[][] solve(int[][] A) {
        int[][] result = new int[A[0].length][A.length];
        int M = A[0].length;
        int N = A.length;
        for (int j = 0; j < M; j++) {
            for (int i = 0; i < N; i++) {
                result[j][i] = A[i][j];
            }
        }
        return result;
    }
}
