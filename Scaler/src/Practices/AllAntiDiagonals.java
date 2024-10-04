package Practices;

public class AllAntiDiagonals {

    public static void main(String[] args) {
        // matrix initialisation
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        AllAntiDiagonals aalDiagonals = new AllAntiDiagonals();
        aalDiagonals.allOppDiagonals(A);
    }

    public void allOppDiagonals(int[][] A) {
        int N = A.length;
        int M = A[0].length;

        // iterate the column
        for (int j = 0; j < M; j++) {
            int start = 0;
            int end = j;
            while (start < N && end >= 0) {
                System.out.print(A[start][end] + " ");
                start++;
                end--;
            }
            System.out.println();
        }

        // iterate the row
        for (int i = 1; i < N; i++) {
            int start = i;
            int end = M - 1;
            while (start < N && end >= 0) {
                System.out.print(A[start][end] + " ");
                start++;
                end--;
            }
            System.out.println();
        }
    }
}
