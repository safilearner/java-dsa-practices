package Bits;

import java.util.ArrayList;
import java.util.List;

public class SingleNumber {

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>();
        SingleNumber sN = new SingleNumber();
        input.add(5);
        input.add(7);
        input.add(2);
        input.add(2);
        input.add(5);

        int result = sN.singleNumber(input);
        System.out.println(result);
    }

    public int singleNumber(final List<Integer> A) {
        int result = 0;
        int N = A.size();
        for (int i = 0; i < N; i++) {
            result = result ^ A.get(i);
        }
        return result;
    }

}
