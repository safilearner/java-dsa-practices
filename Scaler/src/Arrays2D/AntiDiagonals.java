package Arrays2D;

public class AntiDiagonals {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        AntiDiagonals antDiag = new AntiDiagonals();
        int[][] X = antDiag.diagonal(A);
        for (int[] S : X) {
            for (int T : S) {
                System.out.print(T + " ");
            }
            System.out.println();
        }

    }

    public int[][] diagonal(int[][] A) {
        int N = A.length;
        int M = A[0].length;
        int[][] result = new int[2 * N - 1][M];
        // row index for the resultant array
        // every time a diagonal is found, it should be added in new row
        int rowIndex = 0;
        for (int j = 0; j < M; j++) {
            int start = 0;
            int end = j;
            int colIndex = 0;
            while (start < N && end >= 0) {
                result[rowIndex][colIndex] = A[start][end];
                start++;
                end--;
                colIndex++;
            }
            // every time the diagonal should start in the next row of resultant array
            rowIndex++;
        }

        for (int i = 1; i < N; i++) {
            int start = i;
            int end = M - 1;
            int colIndex = 0;
            while (start < N && end >= 0) {
                result[rowIndex][colIndex] = A[start][end];
                start++;
                end--;
                colIndex++;
            }
            rowIndex++;
        }
        return result;
    }
}
