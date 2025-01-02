package ArrayProblems;

import java.util.ArrayList;
import java.util.Collections;

public class BthMaxBthMin {
    public static void main(String[] args) {
        BthMaxBthMin maxMin = new BthMaxBthMin();
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(5);
        aList.add(17);
        aList.add(100);
        aList.add(11);

        int B = 1;
        int result = maxMin.solve(aList, B);
        System.out.println(result);
    }

    public int solve(ArrayList<Integer> A, int B) {
        int N = A.size();
        Collections.sort(A);
        int BthMax = A.get(N - B);
        int BthMin = A.get(B - 1);
        return BthMax - BthMin;
    }
}
