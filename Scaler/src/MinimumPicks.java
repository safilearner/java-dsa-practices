import java.util.ArrayList;

public class MinimumPicks {

    public static void main(String[] args) {
        MinimumPicks minPicks = new MinimumPicks();
        ArrayList<Integer> input = new ArrayList<>();
        input.add(0);
        input.add(2);
        input.add(9);

        int result = minPicks.solve(input);
        System.out.println(result);
    }

    public int solve(ArrayList<Integer> A) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.
        int N = A.size();

        int maxEven = Integer.MIN_VALUE;
        int minOdd = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if (A.get(i) % 2 == 0) {
                if (maxEven < A.get(i)) {
                    maxEven = A.get(i);
                }
            } else {
                if (minOdd > A.get(i)) {
                    minOdd = A.get(i);
                }
            }
        }
        return maxEven - minOdd;
    }
}
