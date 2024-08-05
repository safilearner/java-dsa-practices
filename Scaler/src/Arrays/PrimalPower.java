package Arrays;

import java.util.ArrayList;

public class PrimalPower {
    public static void main(String[] args) {
        // [-11, 7, 8, 9, 10, 11]
        PrimalPower primal = new PrimalPower();
        ArrayList<Integer> A = new ArrayList<>();
        int[] inputArr = {-11, 7, 8, 9, 10, 11};
        for (int x : inputArr) {
            A.add(x);
        }
        int result = primal.solve(A);
        System.out.println(result);

    }

    public int solve(ArrayList<Integer> A) {
        int N = A.size();
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (A.get(i) > 1) {
                boolean checkPrime = true;
                for (int j = 2; j * j <= A.get(i); j++) {
                    if (A.get(i) % j == 0) {
                        checkPrime = false;
                    }
                }
                if (checkPrime) {
                    count++;
                }
            }
        }
        return count;

    }
}
