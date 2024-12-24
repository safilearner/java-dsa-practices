package Arrays2D;

public class RotateMat90 {
    public static void main(String[] args) {
        int[][] B = {{1, 2, 3, 4}, {4, 1, 2, 1}, {7, 9, 8, 3}};
        RotateMat90 rotate = new RotateMat90();
        rotate.solveI(B);
    }

    // Solution 1: Extra space
    public void solve(int[][] A) {
        int N = A.length;
        int M = A[0].length;
        int[][] res = new int[N][M];

        // transpose the given matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                res[i][j] = A[j][i];
            }
        }

        // reverse every row
        for (int i = 0; i < N; i++) {
            int j = 0;
            int k = M - 1;
            while (j < k) {
                int temp = res[i][j];
                res[i][j] = res[i][k];
                res[i][k] = temp;
                j++;
                k--;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = res[i][j];
            }
        }

        for (int[] arr : A) {
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    // solution 2: no extra space
    public void solution(int[][] A) {
        int N = A.length;
        int M = A.length;


    }


    public void solveI(int[][] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][n - j - 1];
                A[i][n - j - 1] = temp;
            }
        }
        System.out.println(A.length);
        System.out.println(A[0].length);
    }
}
