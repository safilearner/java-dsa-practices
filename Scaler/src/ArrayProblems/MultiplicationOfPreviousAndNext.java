package ArrayProblems;

import java.util.ArrayList;

public class MultiplicationOfPreviousAndNext {
    public static void main(String[] args) {
        MultiplicationOfPreviousAndNext multiplyPrevious = new MultiplicationOfPreviousAndNext();
        ArrayList<Integer> aList = new ArrayList<>();
//        aList.add(1);
//        aList.add(2);
//        aList.add(3);
//        aList.add(4);
//        aList.add(5);

        aList.add(0);

        ArrayList<Integer> result = multiplyPrevious.solve(aList);
        for (int x : result) {
            System.out.print(x + " ");
        }
    }

    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> B = new ArrayList<>();
        int N = A.size();

        if (N == 1) {
            B.add(0);
            return B;
        }

        for (int i = 0; i < N; i++) {
            if (i == 0) {
                B.add(i, A.get(i) * A.get(i + 1));
            } else if (i == N - 1) {
                B.add(i, A.get(i) * A.get(i - 1));
            } else {
                B.add(i, A.get(i - 1) * A.get(i + 1));
            }
        }
        return B;
    }
}
