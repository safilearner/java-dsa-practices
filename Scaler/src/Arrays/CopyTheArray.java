package Arrays;

import java.util.ArrayList;
import java.util.List;

public class CopyTheArray {
    public static void main(String[] args) {
        CopyTheArray copyArray = new CopyTheArray();
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(2);
        input.add(1);

        int B = 3;
        ArrayList<Integer> result = copyArray.solve(input, B);
        for (int x : result) {
            System.out.print(x + " ");
        }
    }

    public ArrayList<Integer> solve(final List<Integer> A, int B) {
        ArrayList<Integer> aList = new ArrayList<>();
        int N = A.size();
        for (int i = 0; i < N; i++) {
            aList.add(A.get(i) + B);
        }
        return aList;
    }
}
