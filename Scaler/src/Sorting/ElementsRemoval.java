package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class ElementsRemoval {

    public static void main(String[] args) {
        ElementsRemoval elementsRemoval = new ElementsRemoval();
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(1);
        aList.add(2);
        int result = elementsRemoval.solve(aList);
        System.out.println(result);

        int result1 = elementsRemoval.solveI(aList);
        System.out.println(result1);

        int result2 = elementsRemoval.solveII(aList);
        System.out.println(result2);
    }


    // O(N^N)
    public int solve(ArrayList<Integer> A) {
        int N = A.size();
        int ans = 0;
        Collections.sort(A);
        for (int i = N - 1; i >= 0; i--) {
            int sum = 0;
            for (int j = i; j >= 0; j--) {
                sum = sum + A.get(j);
            }
            ans = ans + sum;
        }
        return ans;
    }

    // optimal solution - O(N)
    public int solveI(ArrayList<Integer> A) {
        int N = A.size();
        int ans = 0;
        Collections.sort(A, Collections.reverseOrder());
        for (int i = 0; i < N; i++) {
            ans = ans + (A.get(i) * (i + 1));
        }
        return ans;
    }

    // optimal solution - O(N)
    public int solveII(ArrayList<Integer> A) {
        int N = A.size();
        int ans = 0;
        Collections.sort(A, Collections.reverseOrder());
        for (int i = 0; i < N; i++) {
            ans = ans + (A.get(i) * (i + 1));
        }
        return ans;
    }

    // optimal solution - O(N)
    public int solveIII(ArrayList<Integer> A) {
        int N = A.size();
        int ans = 0;
        Collections.sort(A);
        for (int i = N - 1; i >= 0; i--) {
            ans = ans + (A.get(i) * (N - i));
        }
        return ans;
    }
}
