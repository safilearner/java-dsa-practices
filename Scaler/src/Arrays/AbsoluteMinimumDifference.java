package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class AbsoluteMinimumDifference {
    public static void main(String[] args) {
        AbsoluteMinimumDifference absMinDiff = new AbsoluteMinimumDifference();
        int[] A = {1, 2, 3, 4, 5};
        int output = absMinDiff.solve(A);
        System.out.println(output);

        int[] B = {5, 17, 100, 11};
        output = absMinDiff.solve1(B);
        System.out.println(output);

    }

    public int solve(int[] A) {
        int N = A.length;
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (Math.abs(A[i] - A[j]) < result) {
                    result = Math.abs(A[i] - A[j]);
                }
            }
        }
        return result;
    }

    // Sorting is used here, so that the difference between the adjacent elements are lesser
    // So we can compare only the adjacent elements
    // no need to compare the second adjacent element because obviously the difference
    // will be greater than the first adjacent element
    public int solve1(int[] A) {
        int N = A.length;
        int result = Integer.MAX_VALUE;
        Arrays.sort(A);
        for (int i = 0; i < N - 1; i++) {
            int diff = Math.abs(A[i] - A[i + 1]);
            if (result > diff) {
                result = diff;
            }
        }
        return result;
    }
}
