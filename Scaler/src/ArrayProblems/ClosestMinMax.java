package ArrayProblems;

import java.util.ArrayList;

public class ClosestMinMax {
    public static void main(String[] args) {
        ClosestMinMax closest = new ClosestMinMax();
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(2);
        aList.add(6);
        aList.add(1);
        aList.add(6);
        aList.add(9);

        ArrayList<Integer> bList = new ArrayList<>();
        bList.add(1);
        bList.add(9);

        System.out.println(closest.solve(aList));
        System.out.println(closest.solve(bList));

    }

    public int solve(ArrayList<Integer> A) {
        int N = A.size();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        // find min max
        for (int i = 0; i < N; i++) {
            if (max < A.get(i)) {
                max = A.get(i);
            }
            if (min > A.get(i)) {
                min = A.get(i);
            }
        }

        int result = N;
        int startMaxPos = N - 1;
        int startMinPos = N - 1;
        for (int i = 0; i < N; i++) {
            if (A.get(i) == max) {
                result = Math.min(result, Math.abs(startMaxPos - startMinPos) + 1);
                startMaxPos = i;
            }
            if (A.get(i) == min) {
                result = Math.min(result, Math.abs(startMaxPos - startMinPos) + 1);
                startMinPos = i;
            }
        }
        return result;
    }
}
