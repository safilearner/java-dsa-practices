package ArrayProblems;

public class MaxSumContiguousSubArray {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, -10};
        MaxSumContiguousSubArray maxSum = new MaxSumContiguousSubArray();
        int result = maxSum.maxSubArray(A);
        System.out.println(result);
    }

    public int maxSubArray(final int[] A) {
        int max = Integer.MIN_VALUE;
        int N = A.length;
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = i; j < N; j++) {
                sum = sum + A[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
}
