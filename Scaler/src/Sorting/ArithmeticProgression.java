package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class ArithmeticProgression {
    public static void main(String[] args) {
        ArithmeticProgression ap = new ArithmeticProgression();
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(3);
        aList.add(5);
        aList.add(1);

        ArrayList<Integer> bList = new ArrayList<>();
        bList.add(1);
        bList.add(8);
        bList.add(4);

        int result = ap.solve(aList);
        int result1 = ap.solve(bList);

        System.out.println(result);
        System.out.println(result1);
    }

    public int solve(ArrayList<Integer> A) {
        int N = A.size();
        Collections.sort(A);
        int diff = Math.abs(A.get(0) - A.get(1));
        for (int i = 1; i < N; i++) {
            if (A.get(i) - A.get(i - 1) != diff) {
                return 0;
            }
        }
        return 1;
    }
}
