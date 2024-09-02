package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArithmeticProgression {
    public static void main(String[] args) {
        ArithmeticProgression ap = new ArithmeticProgression();
        ArrayList<Integer> input = new ArrayList<>();
        input.add(3);
        input.add(5);
        input.add(1);
        int result = ap.solve(input);
        System.out.println(result);
    }

    public int solve(ArrayList<Integer> A) {
        int N = A.size();
        Collections.sort(A);
        int diff = A.get(0) - A.get(1);
        int i = 0;
        while (i < N - 1) {
            int j = i + 1;
            if (A.get(i) - A.get(j) != diff) {
                return 0;
            }
            i++;
        }
        return 1;
    }
}
