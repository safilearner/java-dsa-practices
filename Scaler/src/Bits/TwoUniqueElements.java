package Bits;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TwoUniqueElements {
    public static void main(String[] args) {
        TwoUniqueElements twoUnique = new TwoUniqueElements();
        ArrayList<Integer> input = new ArrayList<>();
        input.add(5);
        input.add(5);
        input.add(8);
        input.add(8);
        input.add(2);
        input.add(1);

        ArrayList<Integer> output = twoUnique.solve(input);
        for(int x : output)
        {
            System.out.print(x + " ");
        }

    }

    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        int N = A.size();
        int X = 0;
        // get XOR of all elements
        for (int i = 0; i < N; i++) {
            X = X ^ A.get(i);
        }

        int pos = 0;
        // find set bit position
        for (int i = 0; i < 31; i++) {
            if (((X >> i) & 1) == 1) {
                pos = i;
                break;
            }
        }

        int set = 0;
        int unset = 0;
        for (int i = 0; i < N; i++) {
            if (((A.get(i) >> pos) & 1) == 1) {
                set = set ^ A.get(i);
            } else
                unset = unset ^ A.get(i);
        }
        result.add(set);
        result.add(unset);
        Collections.sort(result);
        return result;
    }
}
