package ArrayProblems;

import java.util.ArrayList;

public class MinMaxInArray {
    public static void main(String[] args) {
        MinMaxInArray minmax = new MinMaxInArray();
        ArrayList<Integer> aList = new ArrayList<>();
        //[-2, 1, -4, 5, 3]
        aList.add(-2);
        aList.add(1);
        aList.add(-4);
        aList.add(5);
        aList.add(3);

        int result = minmax.solve(aList);
        System.out.println(result);
    }

    public int solve(ArrayList<Integer> A) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int N = A.size();
        for (int i = 0; i < N; i++) {
            if (A.get(i) > max) {
                max = A.get(i);
            }
            if (A.get(i) < min) {
                min = A.get(i);
            }
        }
        return max + min;
    }
}
