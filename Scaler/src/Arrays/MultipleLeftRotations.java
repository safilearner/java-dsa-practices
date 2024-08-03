package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MultipleLeftRotations {
    public static void main(String[] args) {
        MultipleLeftRotations multiLeftRotations = new MultipleLeftRotations();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);

        ArrayList<Integer> B = new ArrayList<>();
        B.add(2);
        B.add(3);

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        result = multiLeftRotations.solve(A, B);

        for (ArrayList<Integer> X : result) {
            for (int Y : X) {
                System.out.print(Y + " ");
            }
            System.out.println();
        }
    }

    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int N = A.size();
        for (int X : B) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                temp.add(A.get((j + X) % N));
            }
            result.add(temp);
        }
        return result;
    }
}
