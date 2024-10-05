package Arrays2D;

public class RowToColumnZero {
    public static void main(String[] args) {
        RowToColumnZero rowToColumn = new RowToColumnZero();
        int[][] A = {{1, 2, 3}, {4, 0, 8}, {9, 1, 1}};
        int[][] res = rowToColumn.solution(A);

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

    }

    public int[][] solve(int[][] A) {
        int[][] res = new int[A.length][A[0].length];

        // copy array
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                res[i][j] = A[i][j];
            }
        }

        int M = A.length;
        int N = A[0].length;
        int rowStart = 0;
        int colStart = 0;
        for (int i = 0; i < M; i++) {

            for (int j = 0; j < N; j++) {
                if (A[i][j] == 0) {
                    rowStart = i;
                    colStart = j;

                    int col = 0;
                    for (int k = 0; k < M; k++) {
                        res[rowStart][col] = 0;
                        col++;
                    }

                    int row = 0;
                    for (int l = 0; l < N; l++) {
                        res[row][colStart] = 0;
                        row++;
                    }
                }
            }
        }
        return res;
    }


    public int[][] solution(int[][] A) {
        int N = A.length;
        int M = A[0].length;

        // iterate over the row
        for (int row = 0; row < N; row++) {

            boolean flag = false;

            for (int col = 0; col < M; col++) {
                if (A[row][col] == 0) {
                    flag = true;
                }
            }

            if (flag) {
                for (int col = 0; col < M; col++) {
                    if (A[row][col] != 0) {
                        A[row][col] = -1;
                    }
                }
            }

        }

        // iterate over the column
        for (int col = 0; col < M; col++) {

            boolean flag = false;

            for (int row = 0; row < N; row++) {
                if (A[row][col] == 0) {
                    flag = true;
                }
            }

            if (flag) {
                for (int row = 0; row < N; row++) {
                    if (A[row][col] != 0) {
                        A[row][col] = -1;
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (A[i][j] == -1) {
                    A[i][j] = 0;
                }
            }
        }
        return A;
    }

    public int[][] solve1(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        boolean[] zeroRows = new boolean[n];
        boolean[] zeroCols = new boolean[m];

        // Identify rows and columns containing zeros
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (A[row][col] == 0) {
                    zeroRows[row] = true;
                    zeroCols[col] = true;
                }
            }
        }

        // Set entire rows to zeros
        for (int row = 0; row < n; row++) {
            if (zeroRows[row]) {
                for (int col = 0; col < m; col++) {
                    A[row][col] = 0;
                }
            }
        }

        // Set entire columns to zeros
        for (int col = 0; col < m; col++) {
            if (zeroCols[col]) {
                for (int row = 0; row < n; row++) {
                    A[row][col] = 0;
                }
            }
        }

        return A;
    }
}
