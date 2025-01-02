package ArrayProblems;

import java.util.ArrayList;

public class EquilibriumIndex {
    public static void main(String[] args) {
        EquilibriumIndex eqIndex = new EquilibriumIndex();
        ArrayList<Integer> input = new ArrayList<>();
        input.add(-7);
        input.add(1);
        input.add(5);
        input.add(2);
        input.add(-4);
        input.add(3);
        input.add(0);
        int x = eqIndex.solve(input);
        System.out.println(x);
    }


    // With extra space space. Prefix sum will take extra space
    public int solve(ArrayList<Integer> A) {
        int N = A.size();

        // construct prefix sum
        ArrayList<Integer> PF = new ArrayList<>();
        PF.add(0, A.get(0));
        for (int i = 1; i < N; i++) {
            PF.add(i, PF.get(i - 1) + A.get(i));
        }

        int eqIndex = Integer.MAX_VALUE;
        System.out.println(eqIndex);

        if (PF.get(N - 1) - PF.get(0) == 0) {
            eqIndex = 0;
        }
        if (PF.get(N - 1) == 0) {
            eqIndex = N - 1;
        }
        for (int i = 1; i < N; i++) {
            if (PF.get(i - 1) == PF.get(N - 1) - PF.get(i)) {
                eqIndex = Math.min(i, eqIndex);
            }
        }

        if (eqIndex == Integer.MAX_VALUE) {
            eqIndex = -1;
        }

        return eqIndex;
    }

    public int Solve1(ArrayList<Integer> A) {
        int N = A.size();
        int sum = 0;

        // calculate total sum
        for (int i = 0; i < N; i++) {
            sum = sum + A.get(i);
        }

        int left_sum = 0;
        for (int i = 0; i < N; i++) {
            sum = sum - A.get(i);
            if (left_sum == sum) {
                return i;
            }
            left_sum = left_sum + A.get(i);
        }
        return -1;
    }
}
