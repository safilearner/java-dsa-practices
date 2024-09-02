package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfAllSubArrays {
    public static void main(String[] args) {
        SumOfAllSubArrays sumOfAll = new SumOfAllSubArrays();
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(1);
        aList.add(2);
        aList.add(3);
        //[1, 2, 3]
        long result = sumOfAll.subarraySumI(aList);
        System.out.println(result);
    }

    public Long subarraySum(ArrayList<Integer> A) {
        int N = A.size();
        int sum;
        long ans = 0;
        for (int i = 0; i < N; i++) {
            sum = 0;
            for (int j = i; j < N; j++) {
                sum = sum + A.get(j);
                ans = ans + sum;
            }
        }
        return ans;
    }

    public Long subarraySumI(ArrayList<Integer> A) {
        int N = A.size();
        long ans = 0;
        for (int i = 0; i < N; i++) {
            long left = (i+1);
            long right = (N - i);
            long total = left * right;
            ans = ans + total * A.get(i);
        }
        return ans;
    }
}
