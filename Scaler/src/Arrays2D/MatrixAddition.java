package Arrays2D;

public class MatrixAddition {
    public static void main(String[] args) {
        MatrixAddition matAdd = new MatrixAddition();
        int[][] A = {{1,6,1,8,5,9,6,7,2},{3,1,9,3,8,2,10,10,10},{2,2,9,4,6,6,2,8,3}};
        int[][] B = {{2,9,8,3,9,5,3,7,10},{3,4,8,6,6,8,4,1,7},{8,10,6,9,3,7,9,8,5}};
        int[][] C = matAdd.solve(A, B);
        for (int[] D : C) {
            for (int E : D) {
                System.out.print(E + " ");
            }
            System.out.println();
        }
    }

    public int[][] solve(int[][] A, int[][] B) {
        int[][] C = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }
}
