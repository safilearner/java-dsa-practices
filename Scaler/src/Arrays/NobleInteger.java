package Arrays;

import java.util.Arrays;

public class NobleInteger {
    public static void main(String[] args) {
        NobleInteger noble = new NobleInteger();
        int arr[] = {6, -6, -7, 0, -7, 0, 9, 2, -5, -6, 0, -5, 9, 4, -4, -1, -8, -8, -6, 7, -3, 5, -6, -2, 1, -8, -2, 9, -7, -4, -2, -10, -8, 1, 0, -5, -9, -9, 0, 8, -5, -10, 6, -6, -4, -8, -5, -2, 6, -8, 8, -6, 7, -8, -6, -10, 6, 2, 9, 9, 0, -2, 1, 3, 1, -9, 0, 3, 4, -10, -7, 9, -9, 9, 6, 9, 3, 3, -2, 0, 5, -4, -4, -6, -10, 0, -6, 6, -8, 6, -3, -5, 6, 9, 8, -3, 2, -2, 2, 9, -1, 6, 0, -8, -3, -4, -9, 3, 2, -9, 5, 9, 9, -9, -6, 9, 1, -10};
        int result = noble.solve(arr);
        System.out.println(result);
    }

    public int solve(int[] A) {
        Arrays.sort(A);
        int N = A.length;

        if (A[N - 1] == 0) {
            return 1;
        }

        for (int i = 0; i < N - 1; i++) {
            if (A[i] == A[i + 1]) {
                continue;
            }
            if (A[i] == N - 1 - i) {
                return 1;
            }
        }
        return -1;
    }

    public int solveI(int[] A) {
        Arrays.sort(A);
        int N = A.length;
        for (int i = 0; i < N; i++) {
            while (i + 1 < N && A[i] == A[i + 1]) {
                i++;
            }
            if (A[i] == N - 1 - i) {
                return 1;
            }
        }
        return -1;
    }

}
