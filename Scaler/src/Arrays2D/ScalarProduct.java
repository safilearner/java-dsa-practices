package Arrays2D;

public class ScalarProduct {

    public static void main(String[] args) {
        ScalarProduct sclProduct = new ScalarProduct();
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] res = sclProduct.solve(A, 2);
        for (int[] arr : res) {
            for (int X : arr) {
                System.out.print(X + " ");
            }
            System.out.println();
        }
    }

    public int[][] solve(int[][] A, int B) {
        int N = A.length;
        int M = A[0].length;
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < M; col++) {
                A[row][col] = A[row][col] * B;
            }
        }
        return A;
    }
}
