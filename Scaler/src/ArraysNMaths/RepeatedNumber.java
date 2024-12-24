package ArraysNMaths;

import java.util.Arrays;

public class RepeatedNumber {
    public static void main(String[] args) {
        RepeatedNumber repNumber = new RepeatedNumber();
        int[] arr = {1, 2, 3, 5, 5};
        int[] resArr = repNumber.solve(arr);
        for (int X : resArr) {
            System.out.print(X + " ");
        }
    }

    public int[] solve(int A[]) {
        int[] res = new int[2];
        int N = A.length;
        Arrays.sort(A);
        long sum = A[0];
        int rep = -1;
        int miss = -1;
        for (int i = 1; i < N; i++) {
            if (A[i] == A[i - 1]) {
                rep = A[i];
            }
            sum = sum + A[i];
        }
        miss = (int) ((1l * N * (1l * N + 1)) / 2 - sum + rep);
        res[0] = rep;
        res[1] = miss;
        return res;
    }
}
