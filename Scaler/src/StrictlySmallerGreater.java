import java.util.ArrayList;

public class StrictlySmallerGreater {
    public static void main(String[] args) {

        StrictlySmallerGreater sm = new StrictlySmallerGreater();
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(1);
        aList.add(2);
        aList.add(3);
        aList.add(4);

        int result = sm.solve(aList);
        System.out.println(result);


        ArrayList<Integer> aList1 = new ArrayList<>();
        aList1.add(-2);
        aList1.add(-1);
        aList1.add(-3);
        aList1.add(0);
        aList1.add(2);
        aList1.add(1);

        int result1 = sm.solve(aList1);
        System.out.println(result1);

        int[] intArr = {1,2,3,4};

        int result2 = sm.solve1(intArr);
        System.out.println(result2);

        int[] intArr1 = {-2,-1,-3,0,1,2};

        int result3 = sm.solve1(intArr1);
        System.out.println(result3);


    }

    public int solve(ArrayList<Integer> A) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < A.size(); i++) {

            if (max < A.get(i)) {
                max = A.get(i);
            }

            if (min > A.get(i)) {
                min = A.get(i);
            }
        }

        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) != max && A.get(i) != min) {
                count++;
            }
        }

        return count;
    }

    public int solve1(int[] B) {
        int n = B.length;
        int max = B[0];
        int min = B[0];
        for (int i = 0; i < n; i++) {
            if (max < B[i]) {
                max = B[i];
            }

            if (min > B[i]) {
                min = B[i];
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (B[i] > min && B[i] < max)
                count++;
        }
        return count;
    }
}
