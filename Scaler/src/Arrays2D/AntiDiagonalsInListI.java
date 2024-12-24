package Arrays2D;

import Practices.AllAntiDiagonalsInList;

import java.util.ArrayList;

public class AntiDiagonalsInListI {
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
        AntiDiagonalsInListI allAntiDiags = new AntiDiagonalsInListI();
        ArrayList<ArrayList<Integer>> result = allAntiDiags.solve(input);
        for (ArrayList<Integer> row : result) {
            for (int X : row) {
                System.out.print(X + " ");
            }
            System.out.println();
        }

    }

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int N = A.size();
        int M = A.get(0).size();

        // iterate the columns
        for (int j = 0; j < M; j++) {
            ArrayList<Integer> temp = new ArrayList<>();
            int start = 0;
            int end = j;
            while (start < N && end >= 0) {
                temp.add(A.get(start).get(end));
                start++;
                end--;
            }
            while (temp.size() < N) {
                temp.add(0);
            }
            result.add(temp);
        }

        // iterate the rows
        for (int i = 1; i < N; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            int start = i;
            int end = M - 1;
            while (start < N && end >= 0) {
                temp.add(A.get(start).get(end));
                start++;
                end--;
            }
            while (temp.size() < N) {
                temp.add(0);
            }
            result.add(temp);
        }
        return result;
    }
}
