package Arrays2D;

public class SpiralOrderMatrixII {
    public static void main(String[] args) {
        SpiralOrderMatrixII spiralPrinting = new SpiralOrderMatrixII();
        int A = 5;
        int[][] res = spiralPrinting.solve(A);
        for (int[] arr : res) {
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }


    public int[][] solve(int A) {
        int[][] result = new int[A][A];
        int i = 0;
        int j = 0;
        int count = 1;

        int N = result.length;
        int M = result[0].length;
        while (N > 1 && M > 1) {
            for (int k = 1; k <= M - 1; k++) {
                result[i][j] = count;
                count++;
                j++;
            }
            for (int k = 1; k <= N - 1; k++) {
                result[i][j] = count;
                count++;
                i++;
            }
            for (int k = 1; k <= M - 1; k++) {
                result[i][j] = count;
                count++;
                j--;
            }
            for (int k = 1; k <= N - 1; k++) {
                result[i][j] = count;
                count++;
                i--;
            }
            N = N - 2;
            M = M - 2;
            i++;
            j++;
        }
        while (N == 1 && M == 1) {
            result[i][j] = count;
            N = 0;
            M = 0;
        }
        return result;
    }
}
