package ArrayProblems;

import java.util.ArrayList;

public class SubArrayWithLeastAvg {
    public static void main(String[] args) {
        SubArrayWithLeastAvg withLeastAvg = new SubArrayWithLeastAvg();
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(5);
        aList.add(15);
        aList.add(7);
        aList.add(6);
        aList.add(3);
        aList.add(4);
        aList.add(18);
        aList.add(14);
        aList.add(13);
        aList.add(7);
        aList.add(3);
        aList.add(7);
        aList.add(2);
        aList.add(18);
        //[5,15,7,6,3,4,18,14,13,7,3,7,2,18]

        int input = 6;

        int result = withLeastAvg.solveI(aList, input);
        System.out.println(result);
    }

    public int solve(ArrayList<Integer> A, int B) {
        int leastAvg = Integer.MAX_VALUE;
        int minIndex = 0;
        int N = A.size();
        for (int i = 0; i <= N - B; i++) {
            int j = i + B - 1;
            int sum = 0;
            for (int k = i; k <= j; k++) {
                sum = sum + A.get(k);
            }
            if (sum < leastAvg) {
                leastAvg = sum;
                minIndex = i;
            }
        }
        return minIndex;
    }

    public int solveI(ArrayList<Integer> A, int B) {
        int N = A.size();
        int sum = 0;
        for (int i = 0; i < B; i++) {
            sum += A.get(i);
        }
        int min = sum;
        int minIndex = 0;

        for (int i = 1; i <= N - B; i++) {
            int j = i + B - 1;
            sum = sum - A.get(i - 1) + A.get(j);
            if (sum < min) {
                min = sum;
                minIndex = i;
            }

        }
        return minIndex;
    }
}
