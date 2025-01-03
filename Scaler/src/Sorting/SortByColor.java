package Sorting;

import java.util.ArrayList;

public class SortByColor {

    public static void main(String[] args) {
        SortByColor colorSort = new SortByColor();
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(0);
        aList.add(1);
        aList.add(2);
        aList.add(0);
        aList.add(1);
        aList.add(2);
        ArrayList<Integer> bList = colorSort.sortColorsI(aList);
        for (int X : bList) {
            System.out.print(X + " ");
        }

    }

    // O(N) - Swap Numbers
    public ArrayList<Integer> sortColors(ArrayList<Integer> A) {
        int zero = 0;
        int two = A.size() - 1;
        for (int i = 0; i <= two; ) {
            if (A.get(i) == 0) {
                int temp = A.get(zero);
                A.set(zero, 0);
                A.set(i, temp);
                zero++;
                i++;
            } else if (A.get(i) == 2) {
                int temp = A.get(two);
                A.set(two, 2);
                A.set(i, temp);
                two--;
            } else
                i++;
        }
        return A;
    }

    // O(N) - Counting number of 0s,1s,2s
    public ArrayList<Integer> sortColorsI(ArrayList<Integer> A) {
        int N = A.size();
        int red = 0;
        int white = 0;
        int blue = 0;
        for (int i = 0; i < N; i++) {
            if (A.get(i) == 0) {
                red++;
            } else if (A.get(i) == 1) {
                white++;
            } else {
                blue++;
            }
        }
        for (int i = 0; i < N; i++) {
            if (red != 0) {
                A.set(i, 0);
                red--;
            } else if (white != 0) {
                A.set(i, 1);
                white--;
            } else {
                A.set(i, 2);
                blue--;
            }
        }
        return A;
    }
}
