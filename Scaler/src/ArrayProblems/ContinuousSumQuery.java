package ArrayProblems;

import java.util.ArrayList;

public class ContinuousSumQuery {
    public static void main(String[] args) {
        ContinuousSumQuery continuousSum = new ContinuousSumQuery();

        int A = 5;
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        ArrayList<Integer> X = new ArrayList<>();
        X.add(0, 1);
        X.add(1, 2);
        X.add(2, 10);
        B.add(X);
        ArrayList<Integer> X1 = new ArrayList<>();
        X1.add(0, 2);
        X1.add(1, 3);
        X1.add(2, 20);
        B.add(X1);
        ArrayList<Integer> X2 = new ArrayList<>();
        X2.add(0, 2);
        X2.add(1, 5);
        X2.add(2, 25);
        B.add(X2);

        ArrayList<Integer> aList = continuousSum.solve(A, B);
        for (int Y : aList) {
            System.out.print(Y + " ");
        }
        //B = [[1, 2, 10], [2, 3, 20], [2, 5, 25]]

    }

    public ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < A; i++) {
            result.add(0);
        }

        int L = 0;
        int R = 0;
        int P = 0;
        for (ArrayList<Integer> X : B) {
            L = X.get(0);
            R = X.get(1);
            P = X.get(2);
            System.out.println(L + " " + R + " " + P);
            result.set(L - 1, result.get(L - 1) + P);
            if (R < A - 1) {
                result.set(R, result.get(R) + (-P));
            }
            System.out.println(result);
        }

        for (int i = 1; i < result.size(); i++) {
            result.set(i, result.get(i - 1) + result.get(i));
        }

        return result;
    }
}
