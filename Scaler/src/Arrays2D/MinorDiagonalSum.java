package Arrays2D;

public class MinorDiagonalSum {

    public static void main(String[] args) {
        MinorDiagonalSum minorSum = new MinorDiagonalSum();
        int[][] A = {{1, -2, -3}, {-4, 5, -6}, {-7, -8, 9}};
        int res = minorSum.solve(A);
        System.out.println(res);
    }

    public int solve(final int[][] A) {
        int sum = 0;
        int N = A.length;
        for (int i = 0; i < N; i++) {
            int j = N - 1 - i;
            sum = sum + A[i][j];
        }
        return sum;
    }
}
