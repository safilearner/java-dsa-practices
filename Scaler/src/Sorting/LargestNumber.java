package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LargestNumber {
    public static void main(String[] args) {

        LargestNumber largest = new LargestNumber();

        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(3);
        aList.add(30);
        aList.add(34);
        aList.add(5);
        aList.add(9);

        ArrayList<Integer> bList = new ArrayList<>();
        int[] intArr = {782, 240, 409, 678, 940, 502, 113, 686, 6, 825, 366, 686, 877, 357, 261, 772, 798, 29, 337, 646, 868, 974, 675, 271, 791, 124, 363, 298, 470, 991, 709, 533, 872, 780, 735, 19, 930, 895, 799, 395, 905};

        for (int X : intArr) {
            bList.add(X);
        }
        //String res = largest.largestNumber(aList);
        String res = largest.largestNumber(aList);
        System.out.println(res);
    }

    public String largestNumber(ArrayList<Integer> A) {
        String res = "";

        Comparator<Integer> customComp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String X = String.valueOf(o1);
                String Y = String.valueOf(o2);
                return (Y + X).compareTo(X + Y);
            }
        };

        Collections.sort(A, customComp);

        for (int X : A) {
            res = res + X;
        }

        if (res.charAt(0) == '0') {
            res = "0";
        }
        return res;
    }
}
