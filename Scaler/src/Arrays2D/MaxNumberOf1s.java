package Arrays2D;

public class MaxNumberOf1s {
    public static void main(String[] args) {
        MaxNumberOf1s max1sInARow = new MaxNumberOf1s();
        int[][] A = {{0, 0, 0, 0}, {0, 0, 0, 1}, {0, 0, 1, 1}, {0, 1, 1, 1}};
        int[][] A1 = {{0, 1, 1}, {0, 0, 1}, {0, 1, 1}};
        int result = max1sInARow.solve(A1);
        System.out.println(result);
        result = max1sInARow.solve(A);
        System.out.println(result);
    }

    public int solve(int[][] A) {
        int index = 0;
        int N = A.length;
        int M = A[0].length;

        int i = 0;
        int j = M - 1;

        while (i < N && j >= 0) {
            if (A[i][j] == 1) {
                index = i;
                j--;
            } else {
                i++;
            }
        }
        return index;
    }
}
