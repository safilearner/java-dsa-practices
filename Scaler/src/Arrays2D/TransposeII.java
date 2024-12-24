package Arrays2D;


public class TransposeII {
    public static void main(String[] args) {
        TransposeII trans = new TransposeII();
        int[][] A = {{1, 2, 3, 4}, {1, 3, 5, 7}, {2, 4, 6, 8}, {1, 2, 3, 5}};
        int[][] B = {{24,63,39,81,84,30},
                     {21,64,95,6,88,73},
                     {33,6,63,96,86,66},
                     {62,88,23,52,94,77},
                     {81,58,74,18,16,25},
                     {26,40,88,64,72,23},
                     {45,44,86,92,50,26},
                     {64,34,83,26,29,68},
                     {43,42,7,17,45,52},
                     {94,25,62,19,95,77}};
        int[][] result = trans.solveI(B);
        for (int arr[] : result) {
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }


    // best solution: it has no extra space
    // it will work only for square matrix
    public int[][] solve(int[][] A) {
        int N = A.length;
        int M = A[0].length;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < M; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        return A;
    }


    public int[][] solveI(int[][] A) {
        int N = A.length;
        for(int i=1 ; i<N ; i++){
            for(int j=0 ; j<i ; j++){
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        return A;
    }
}
