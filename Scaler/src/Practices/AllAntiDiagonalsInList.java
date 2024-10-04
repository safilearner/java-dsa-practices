package Practices;

import java.util.ArrayList;

public class AllAntiDiagonalsInList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        input.add(A);
        ArrayList<Integer> B = new ArrayList<>();
        B.add(4);
        B.add(5);
        B.add(6);
        input.add(B);
        ArrayList<Integer> C = new ArrayList<>();
        C.add(7);
        C.add(8);
        C.add(9);
        input.add(C);
        AllAntiDiagonalsInList allAntiDiags = new AllAntiDiagonalsInList();
        ArrayList<ArrayList<Integer>> result = allAntiDiags.getAntiDiagonals(input);
        for (ArrayList<Integer> row : result) {
            for (int X : row) {
                System.out.print(X + " ");
            }
            System.out.println();
        }

    }

    public ArrayList<ArrayList<Integer>> getAntiDiagonals(ArrayList<ArrayList<Integer>> aList) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int N = aList.size();
        for (int i = 0; i < 2 * N - 1; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            int start = i < N ? 0 : i - N + 1;
            int k = 0;
            for (int j = start; j <= i - start; j++) {
                row.add(aList.get(j).get(i - j));
                k++;
            }
            for (int j = k; j < N; j++) {
                row.add(0);
            }
            res.add(row);
        }
        return res;
    }
}
